import java.util.*;

public class CheckAlpha {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char input = userInput.nextLine().charAt(0);
		while (!Character.isLetter(input)) {
			System.out.println("Not a letter. Enter a letter: ");
			input = userInput.nextLine().charAt(0);
		}
		System.out.println("Done.");
		userInput.close();
	}
}