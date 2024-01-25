import java.util.*;

public class Compass4p {
	public static Scanner userInput = new Scanner(System.in);
	public static void Invalid() {System.out.println("Invalid"); System.exit(0);}
	
    public static void main(String[] args) {
    	String[] Compass = {"N", "NE", "E", "SE", "S", "SW", "W", "NW", "N"};
        int[] Bearing = {0, 45, 90, 135, 180, 225, 270, 315, 360};
		
		String compass = userInput.next();
		char dir1 = compass.charAt(0), dir2 = compass.charAt(compass.length() - 1); 
		int angle = 0, bearing = 0;
		Boolean dir1Valid = false, dir2Valid = false;
		int dir1Angle = 0, dir2Angle = 0;
		
		switch (compass.length()) {
		case 1: case 2: 
			break;
		case 3: case 4:
			try {angle = Integer.parseInt(compass.substring(1, compass.length()-1));}
			catch (NumberFormatException a) {Invalid();}
			break;
		default : Invalid();
		}	

		for (int i = 0; i < 8; i += 2) {
			if (Compass[i].charAt(0) == dir1) {dir1Angle = Bearing[i]; dir1Valid = true;}
			if (Compass[i].charAt(0) == dir2) {dir2Angle = Bearing[i]; dir2Valid = true;}
		}				
		
		if (!(dir1Valid && dir2Valid)) Invalid();
		
		if (dir1 == 'N' && dir2 == 'W') dir1Angle = 360;
		else if (dir1 == 'W' && dir2 == 'N') dir2Angle = 360;
		
		switch (compass.length()) {
		case 1:
			bearing = dir1Angle;
			break;
		case 2:
			if (dir1 == dir2) Invalid();
			
			dir1Valid = false;
			for (int i = 1; i < 8; i += 2) if (Compass[i].equals(compass)) dir1Valid = true;
			if (!dir1Valid) Invalid();
			
			bearing = (dir1Angle + dir2Angle)/2; 
			break;
		case 3: case 4:
			if (dir1 == dir2 || Math.abs(dir1Angle - dir2Angle) == 180 || angle > 45) Invalid();
			
			bearing = (dir2Angle > dir1Angle)?  dir1Angle + angle : dir1Angle - angle;
			break;
		}
		
		System.out.println("Compass " + compass + " is a bearing of " + bearing); 	
		
    }
}