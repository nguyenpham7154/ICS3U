import java.util.*;

public class FindGCD {
	public static Scanner userInput = new Scanner(System.in);
	
	public static int gcd(int x, int y) {
		return (x == 0)? y : gcd(y%x, x);
	}
	
	public static void main(String[] args) {
		
		int x = userInput.nextInt();
		int y = userInput.nextInt();
		System.out.println(gcd(x, y));
		
    }
}