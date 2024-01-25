import java.util.*;

public class SentinelValue {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a sentinel value: ");
		int sentinel = userInput.nextInt();
		System.out.println("Enter an integer: ");
		int entry = userInput.nextInt();
		while (entry != sentinel) {
			System.out.println("Enter an integer: ");
			entry = userInput.nextInt();
		}
		System.out.println("Stop");
		userInput.close();
	}
}