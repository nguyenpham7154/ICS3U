import java.util.*;

public class Modulus {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter first num: ");
		int num1 = user_input.nextInt();
		System.out.println("Enter second num: ");
		int num2 = user_input.nextInt();
		System.out.println("What is " +num1+ " mod " +num2+ "?");
		int ans = user_input.nextInt();
		int rem = num1%num2;
		if (ans == rem) {
			System.out.println("Congrats - correct.");
		} else {
			System.out.println("Incorrect."
					+ "\nModulus returns the remainder."
					+ "\n" +num2+ " divides into " +num1+ ", " +(int)Math.floor(num1/num2)+ " times and there is " +rem+ " leftover."
					+ "\n" +num1+ " mod " +num2+ " is " +rem+ ".");
		}
		
		user_input.close();
	}
}