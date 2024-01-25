import java.util.*;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		long num = userInput.nextInt();
		long sum = 0, n = num;
		while (num<=0) {
			System.out.println("Enter a positive integer: ");
			num = userInput.nextInt();
			n = num;
		}
		while (n>0) {
			sum += n%10;
			n /= 10;
		}
		System.out.println("Sum of " +num+ "\'s digits is " +sum);
		userInput.close();
	}
}

