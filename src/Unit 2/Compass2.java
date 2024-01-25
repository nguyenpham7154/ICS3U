import java.util.*;

public class Compass2 {
    public static Scanner userInput = new Scanner(System.in);

      public static void main(String[] args) {
        int bearing = userInput.nextInt();
        String direction;
        if (bearing >= 360) System.out.println("Invalid");
        else {
            if (bearing <= 45 || bearing >= 315) direction = "North";
            else if (bearing < 135) direction = "East";
            else if (bearing < 225) direction = "South";
            else direction = "West";
            System.out.println("Bearing " + bearing + " is closest to " + direction);
        }
    }
}
