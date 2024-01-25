import java.util.*;

public class ChangeImproved {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter amount less than $1");
		int cents = userInput.nextInt();
				
		int Q = cents/25;
		int d = cents%25/10;
		int n = cents%25%10/5;
		int p = cents%25%10%5;
		
		System.out.println("Your change is: \n" +
				((Q == 0) ? "" : Q + " quarter" + ((Q == 1) ? "" : "s") + "\n") +
				((d == 0) ? "" : d + " dime" + ((d == 1) ? "" : "s") + "\n") +
				((n == 0) ? "" : n + " nickel" + ((n == 1) ? "" : "s") + "\n") +
				((p == 0) ? "" : p + ((p == 1) ? " penny" : " pennies") + "\n")
		);
		userInput.close();
	}
}
