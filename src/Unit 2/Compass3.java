import java.util.*;

public class Compass3 {
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        String[] Compass = {"N", "NE", "E", "SE", "S", "SW", "W", "NW", "N"};
        int [] Bearing = {0, 45, 90, 135, 180, 225, 270, 315, 360};
        int bearing = userInput.nextInt();
        String output = "";

        if (bearing >= 360) {System.out.println("Invalid"); System.exit(0);}
        else if (bearing % 45 == 0) output = Compass[(bearing/45)%8];
        else {
            int i = (int) Math.round(bearing/90.0);
            String ref = Compass[i*2];
            String away = (bearing > Bearing[i*2])? Compass[(i*2)+2] : Compass[(i*2)-2];
            int angle = Math.abs(bearing - Bearing[i*2]);
            output = ref + angle + away;
        }
        System.out.println("Bearing " + bearing + " is " + output);
    }
}