import java.util.*;

public class PasswordGenerator {
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) { 
		String s1, s2, s3, str;
		
		s1 = userInput.nextLine();
		s2 = userInput.nextLine();
		s3 = userInput.nextLine();
		
		str = s1.substring(0, 1).toUpperCase();
		str += s2.substring(0, 1).toUpperCase();
		str += s3.substring(0, 1).toUpperCase();
		
		str += Math.abs(s1.length() - s2.length());
		
		int i = s1.indexOf("a");
		if (i%2 == 0 && i < 10) str += i;
		else str += '#';
		
		s3 = s3.replaceAll("\\s+", "").toLowerCase();
		int s3len = s3.length();
		if (s3len >= 3) 
			str += s3.substring(s3len - 3, s3len);
		else {
			str += s3;
			for (int j = 0; j < 3 - s3len; j++) {
				str += '%';
			}
		}
	
		System.out.println(str);
	}
}
