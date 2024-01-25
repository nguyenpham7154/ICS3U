import java.util.*;

public class Compass4 {
	public static Scanner userInput = new Scanner(System.in);
	
    public static void main(String[] args) {
        String[] Compass = {"N", "NE", "E", "SE", "S", "SW", "W", "NW", "N"};
        int[] Bearing = {0, 45, 90, 135, 180, 225, 270, 315, 360};

    	char dir1 = userInput.next().charAt(0);
		int angle = userInput.nextInt();
		char dir2 = userInput.next().charAt(0);
		String compass = dir1 + Integer.toString(angle) + dir2;
		int bearing = 0;
				
		if (angle > 45) {System.out.println("Invalid"); System.exit(0);}
		
		if (dir1 == 'N' && dir2 == 'W') bearing = 360 - angle;
		else {
			int d1a = 0, d2a = 0;
			for (int i = 0; i < 8; i += 2) {
				if (Compass[i].charAt(0) == dir1) d1a = Bearing[i];
				if (Compass[i].charAt(0) == dir2) d2a = Bearing[i];
			}
			bearing = (d2a > d1a)? d1a + angle : d1a - angle;			
		}
		System.out.println("Compass " + compass + " is a bearing of " + bearing);
    	
    }
}