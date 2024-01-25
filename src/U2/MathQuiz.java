import java.util.*;

public class MathQuiz {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		int counter = 0;
		System.out.println("Simple Math Quiz");
		System.out.println("\nQuestion 1: \n5+2 = ");
		int ans1 = user_input.nextInt();
		if (ans1 == 7) {
			System.out.println("Correct.");
			counter++;
		} else {
			System.out.println("Incorrect. 5+2 = 7");
		}
		
		System.out.println("\nQuestion 2: \n3*6 = ");
		int ans2 = user_input.nextInt();
		if (ans2 == 18) {
			System.out.println("Correct.");
			counter++;
		} else {
			System.out.println("Incorrect. 3*6 = 18");
		}
		
		System.out.println("\nQuestion 3: \n88-3 = ");
		int ans3 = user_input.nextInt();
		if (ans3 == 85) {
			System.out.println("Correct.");
			counter++;
		} else {
			System.out.println("Incorrect. 88-3 = 85");
		}
		
		System.out.println("\nScore: " +counter+ "/3");
		user_input.close();
	}
}