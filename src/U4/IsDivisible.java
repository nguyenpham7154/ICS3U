import java.util.*;

public class IsDivisible {
	public static Scanner userInput = new Scanner(System.in);
	
	public static boolean isDivisible(int x, int y) {
		if (x % y == 0) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		int x = userInput.nextInt();
		int y = userInput.nextInt();
		System.out.println(isDivisible(x, y));
		
    }
}