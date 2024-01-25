import java.util.*;

public class RollTwoDice {
	public static Scanner userInput = new Scanner(System.in);
	
	public static void twoDieRoll() {
		int d1 = (int) (Math.floor(Math.random()*6)+1);
		int d2 = (int) (Math.floor(Math.random()*6)+1);
		System.out.println(d1 +" and "+ d2 + " ==> total " + (d1+d2));
	}
		
	public static void main(String[] args) {
		
		twoDieRoll();
		
    }
}