import java.util.*;

public class DieRoll {
	public static Scanner userInput = new Scanner(System.in);
	
	public static void dieRoll() {
		System.out.println("You rolled a " + (int) (Math.floor(Math.random()*6)+1));
	}
		
	public static void main(String[] args) {
		
		 dieRoll();
		
    }
}