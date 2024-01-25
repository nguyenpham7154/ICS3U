import java.util.*;

public class SmallestOfThree {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		int smallest;
		System.out.println("Enter first number: ");
		int num1 = user_input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = user_input.nextInt();
		System.out.println("Enter third number: ");
		int num3 = user_input.nextInt();
				
		if (num1 < num2 && num1 < num3) {
		    smallest = num1;
		} else if (num2 < num3) {
		    smallest = num2;
		} else {
		    smallest = num3;
		}
		
		System.out.println("The smallest number is: " +smallest);
		user_input.close();
	}
}