import java.util.*;

public class Change {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter cents: ");
		int cents = user_input.nextInt();
		int Q = cents/25;
		int d = cents%25/10;
		int n = cents%25%10/5;
		int p = cents%25%10%5;
		System.out.println("Quarters "+Q+", " + "dimes "+d+", " + "nickels "+n+", " + "pennies "+p);
        user_input.close();
	}
}