import java.util.*;

public class Validate {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Continue (y or n): ");
		String input = userInput.nextLine();
		while (!input.equals("y") && !input.equals("n")) {
			System.out.println("Continue (y or n): ");
			input = userInput.nextLine();
		}
		System.out.println("done");
		userInput.close();
	}
}