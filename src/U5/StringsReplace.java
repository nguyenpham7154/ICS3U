import java.util.*;

public class StringsReplace {
	public static Scanner userInput = new Scanner(System.in);
	
	public static String replace (String s, char oldChar, char newChar) {
		String str = "";
		int count = 0;
		for (int i=0; i<s.length(); i++) {
			
			if (s.charAt(i) == oldChar) {
				count++;
				if (count%2 == 0) str += newChar;
				else str += s.charAt(i);
			} else str += s.charAt(i);
		}
		return str;
	}
	
	public static void main(String[] args) { 
		
		char oldchar = userInput.nextLine().charAt(0);
		char newchar = userInput.nextLine().charAt(0);
		String s = userInput.nextLine();
		System.out.println(replace(s, oldchar, newchar));
		
	}
}
