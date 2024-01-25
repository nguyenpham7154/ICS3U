import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		String str = userInput.nextLine().toLowerCase().replaceAll("\\s", "");
		String rev = "";
		for (int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		if (str.equals(rev)) System.out.println("true");
		else System.out.println("false");
		
		userInput.close();
	}
}