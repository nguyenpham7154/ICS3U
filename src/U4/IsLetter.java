import java.util.*;

public class IsLetter {
	public static Scanner userInput = new Scanner(System.in);
	
	public static boolean isLetter(String str) {
		if (str.length() > 1) return false;
		if (97 <= str.charAt(0) && str.charAt(0) <= 122 || 65 <= str.charAt(0) && str.charAt(0) <= 90) return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		String line = userInput.next();
		System.out.println(isLetter(line));
		
    }
}