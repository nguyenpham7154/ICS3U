// https://replit.com/@NGUYENPHAM32/116-Circle-Calculations#Main.java

import java.util.*;

public class Circle {
	// Rounding function
	public static double round2D(double num) {return Math.round(num * 100) / 100.0;}
	public static void main(String[] args) {
		// Scanner object
    	Scanner userInput = new Scanner(System.in);
    	// pi constant
    	final double PI = Math.PI;
		
    	// Part 1
    	System.out.println("**\nCircle Calculations Assignment\n**"); 	
    	System.out.println("\n--- PART 1 ---");
    	
    	System.out.println("Enter h and k:");
    	int h = userInput.nextInt(), k = userInput.nextInt();
    	System.out.println("Enter point x and y:");
    	int x = userInput.nextInt(), y = userInput.nextInt();
    	
    	System.out.println("\nPart 1 Calculations");
    	// Radius of circle
    	double radius1 = Math.sqrt(Math.pow(h - x, 2) + Math.pow(k - y, 2));
    	System.out.println("Radius = " + round2D(radius1));
    	// Equation of circle in center-radius form
    	double centerRadius = Math.pow(radius1, 2);
    	System.out.println("Equation is (x-" + h + ")^2 + (y-" + k + ")^2 = " + round2D(centerRadius));
    	// Area of circle
    	double area = centerRadius * PI;
    	System.out.println("A = " + round2D(area));
    	// Circumference of circle
    	double circumference = 2 * PI * radius1;
    	System.out.println("C = " + round2D(circumference));
    	
    	// Part 2
    	System.out.println("\n--- PART 2 ---");
    	System.out.println("Enter the angle:");
    	int rotationalAngle = userInput.nextInt();
    	// Principal angle
    	int principalAngle = Math.abs(rotationalAngle % 360);
    	System.out.println("Principal Angle = " + principalAngle);
    	// Rotational angle in radians
    	double rotationalAngleRadians = rotationalAngle * PI / 180.0;
    	System.out.println("Angle in radians = " + round2D(rotationalAngleRadians));
    	
    	// Part 3
    	System.out.println("\n--- PART 3 ---");
    	System.out.println("Enter radius:");
    	int radius3 = userInput.nextInt();
    	System.out.println("Enter angle:");
    	int angle3 = userInput.nextInt();
    			
    	System.out.println("\nPart 3 Calculations");
    	// Arc length
    	double arcLength = radius3 * Math.toRadians(angle3);
    	System.out.println("Arc length = " + round2D(arcLength));
    	// Chord length
    	double chordLength3 = 2.0 * radius3 * Math.sin(Math.toRadians(angle3 / 2.0));
    	System.out.println("Chord length = " + round2D(chordLength3));
    	// Segment Height
    	double segmentHeight3 = radius3 * (1 - Math.cos(Math.toRadians(angle3) / 2.0));
    	System.out.println("Segment height = " + round2D(segmentHeight3));
    	// Area of circular segment
    	double circleSegmentArea = 0.5 * Math.pow(radius3, 2) * (Math.toRadians(angle3) - Math.sin(Math.toRadians(angle3)));
    	System.out.println("Area of circular segment = " + round2D(circleSegmentArea));
    	
    	// Part 4
    	System.out.println("\n--- PART 4 ---");
    	System.out.println("Enter chord length:");
    	int chordLength4 = userInput.nextInt();    	
    	System.out.println("Enter segment height:");
    	int segmentHeight4 = userInput.nextInt();
    	
    	System.out.println("\nPart 4 Calculations");
    	// Radius
    	double radius4 = segmentHeight4 / 2.0 + Math.pow(chordLength4, 2) / (8.0 * segmentHeight4);
    	System.out.println("Radius = " + round2D(radius4));
    	// Segment Angle
    	double segmentAngle = 2 * Math.asin((chordLength4/2.0)/radius4);
    	System.out.println("Segment angle = " + round2D(segmentAngle) + " radians");
    	
    	userInput.close();
    }
}

