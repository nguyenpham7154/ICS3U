import java.util.*;

public class AreaCircle {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		final double pi = 3.14;
		System.out.println("Enter the radius: ");
		double radius = user_input.nextDouble();
		System.out.println("A = " + (pi * Math.pow(radius, 2)) + " units ^2");
		System.out.print("C = " + (2*pi*radius*10/10) + " units");
		
		user_input.close();
	}
}