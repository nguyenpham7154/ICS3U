import java.util.*;

public class y2x5 {	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Part a");
		for (int i=6; i>=0; i--) {
			System.out.println(i +" --> "+ (2*i+5));
		}
		System.out.println("\nPart b");
		for (int i=0; i<=30; i+=3) {
			System.out.println(i +" --> "+ (2*i+5));
		}
		System.out.println("\nPart c");
		for (int i=-15; i<=15; i+=5) {
			System.out.println(i +" --> "+ (2*i+5));
		}
		System.out.println("\nPart d");
		for (int i=1; i<=1024; i*=2) {
			System.out.println(i +" --> "+ (2*i+5));
		}
		userInput.close();
	}
}