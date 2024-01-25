import java.util.*;

public class Rounding {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double number = user_input.nextDouble();
		System.out.println("Number of decimal places: ");
        int decimalPlaces = user_input.nextInt();
        System.out.print(Math.round(number * Math.pow(10, decimalPlaces))/Math.pow(10, decimalPlaces));
		user_input.close();
	}
}