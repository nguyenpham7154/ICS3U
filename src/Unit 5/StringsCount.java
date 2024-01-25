import java.util.*;

public class StringsCount {
	public static Scanner userInput = new Scanner(System.in);
	
	public static int count (char c, String s) {
		int occ = 0;
		s = s.toLowerCase();
		c = Character.toLowerCase(c);
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == c) occ++;
		}
		return occ;
	}
	
	public static void main(String[] args) { 
		
		char c = userInput.nextLine().charAt(0);
		String s = userInput.nextLine();
		System.out.println(count(c, s));
		
	}
}
