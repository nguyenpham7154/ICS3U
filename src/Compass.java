// Level 2	https://replit.com/join/imfqgydvpq-nguyenpham32
// Level 3	https://replit.com/join/niwlftdsmx-nguyenpham32
// Level 4	https://replit.com/join/ibeonsvvpa-nguyenpham32
// Level 4+ https://replit.com/join/wkzhwodwcu-nguyenpham32
// Final    https://replit.com/join/gjvphqluwu-nguyenpham32

import java.util.*;

public class Compass {
    // scanner object and invalid function that exits program
    public static Scanner userInput = new Scanner(System.in);

    public static void Invalid() {
        System.out.println("Invalid");
        System.exit(0);
    }

    // compass directions and associated bearings
    public static String[] Compass = { "N", "NE", "E", "SE", "S", "SW", "W", "NW", "N" };
    public static int[] Bearing = { 0, 45, 90, 135, 180, 225, 270, 315, 360 };

    // function to convert bearing to compass
    public static void BearingToCompass() {
        // gets input, invalid if not an integer between 0 and 360
        System.out.println("Enter a bearing: ");
        String compass = "";
        if (!userInput.hasNextInt()) 
            Invalid();
        int bearing = userInput.nextInt();
        if (bearing < 0 || bearing >= 360) 
            Invalid();

        // if bearing divisible by 45, gets index to find direction
        if (bearing % 45 == 0)
            compass = Compass[(bearing / 45) % 8];
        else {
            // gets index of the reference direction (closest to the bearing)
            int i = (int) Math.round(bearing / 90.0) * 2;
            // assigns reference direction
            String dir1 = Compass[i];
            // finds the other direction (away from the reference)
            String dir2 = (bearing > Bearing[i]) ? Compass[i + 2] : Compass[i - 2];
            // calculates angle by getting the difference between the two directions
            int angle = Math.abs(bearing - Bearing[i]);
            compass = dir1 + angle + dir2;
        }
        // outputs answer
        System.out.println("Bearing " + bearing + " is " + compass);
    }

    // function to convert compass to bearing
    public static void CompassToBearing() {
        // gets input
        System.out.println("Compass direction: ");
        String compass = userInput.next();
        // reference direction is first character of the input string, away direction is last
        char dir1 = compass.charAt(0), dir2 = compass.charAt(compass.length() - 1);
        // angle variable and bearing output
        int angle = 0, bearing = 0;
        // boolean variables to check input validity
        Boolean dir1Valid = false, dir2Valid = false;
        // direction bearings
        int dir1Angle = 0, dir2Angle = 0;

        switch (compass.length()) {
            // if string length is 1 or 2, skip as there isn't an angle
            case 1: case 2:
                break;
            // if length is 3 or 4, assigns the angle value by getting the middle substring, then converts to integer
            // invalid if not a number
            case 3: case 4:
                try { angle = Integer.parseInt(compass.substring(1, compass.length() - 1)); }
                catch (NumberFormatException a) { Invalid(); }
                break;
            // invalid if length larger than 4
            default:
                Invalid();
        }

        // searches directions, if found then assigns bearing of direction
        for (int i = 0; i < 8; i += 2) {
            if (Compass[i].charAt(0) == dir1) {
                dir1Angle = Bearing[i];
                dir1Valid = true;
            }
            if (Compass[i].charAt(0) == dir2) {
                dir2Angle = Bearing[i];
                dir2Valid = true;
            }
        }

        // invalid if inputs are not found valid
        if (!(dir1Valid && dir2Valid)) 
            Invalid();
        // special case for northwest where north has to have a bearing of 360 unless the angle is 0
        if (dir1 == 'N' && dir2 == 'W' && angle != 0) dir1Angle = 360;
        else if (dir1 == 'W' && dir2 == 'N' && angle != 0) dir2Angle = 360;

        switch (compass.length()) {
            case 1:
                bearing = dir1Angle;
                break;
            case 2:
                // checks if input aren't the same and don't start with E or W if not then invalid
                if (dir1 == 'E' || dir1 == 'W' || (dir1 == dir2)) 
                    Invalid();
                // bearing is average of the two directions
                bearing = (dir1Angle + dir2Angle) / 2;
                break;
            case 3: case 4:
                // invalid if both directions are the same as or opposite of each other, or if the angle exceeds 45
                if (dir1 == dir2 || Math.abs(dir1Angle - dir2Angle) == 180 || angle > 45) 
                    Invalid();
                // if reference direction is smaller, the bearing is the sum of it and the angle, else it's the difference of
                bearing = (dir1Angle < dir2Angle) ? dir1Angle + angle : dir1Angle - angle;
                break;
        }
        // outputs answer
        System.out.println("Compass " + compass + " is a bearing of " + bearing);
    }

    public static void main(String[] args) {
        System.out.println(
            "(1) convert bearing to compass\n" +
            "(2) convert compass to bearing\n" +
            "Choose: ");
        // invalid if input is not an integer
        if (!userInput.hasNextInt()) 
            Invalid();
        // executes function based on user input
        switch (userInput.nextInt()) {
            case 1: BearingToCompass(); break;
            case 2: CompassToBearing(); break;
            default: Invalid();
        }
    }
}  