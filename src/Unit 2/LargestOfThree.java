import java.util.*;

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		int largest;
		System.out.println("Enter first number: ");
		int num1 = user_input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = user_input.nextInt();
		System.out.println("Enter third number: ");
		int num3 = user_input.nextInt();
				
		if (num1 > num2 && num1 > num3) {
		    largest = num1;
		} else if (num2 > num3) {
		    largest = num2;
		} else {
			largest = num3;
		}
		
		System.out.println("The largest number is: " +largest);
		user_input.close();
	}
}