import java.util.*;

public class SumWhileLoop {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = userInput.nextInt();
		int sum = 0;
		while (N<0) { 
			System.out.println("Invalid input.\nEnter N: ");
			N = userInput.nextInt();
		}
		for (int i=0; i<=N; i++) {
			sum += i;
		}
		System.out.println("The sum of the first " +N+ " integers is " +sum);
		userInput.close();
	}
}