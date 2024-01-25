import java.util.*;

public class PrintRollDice {
	public static Scanner userInput = new Scanner(System.in);
	
	public static void printRollDice(int numDice) {
		for (int i=1; i<=numDice; i++) {
			int roll = (int) Math.floor(Math.random()*6)+1;
			System.out.println("Roll " +i+ " is a " + roll);
		}
	}
		
	public static void main(String[] args) {
		int n = userInput.nextInt();
		printRollDice(n);
    }
}