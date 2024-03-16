import java.util.*;

public class VoteCount {
	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) { 
		int A = 0, B = 0;
		int V = userInput.nextInt();
		String v = userInput.next();
		
		for (int i=0; i<V; i++) {			
			if (v.charAt(i) == 'A') A++;
			else B++;
		}
		
		if (A == B) System.out.println("Tie");
		else if (A > B) System.out.println("A");
		else System.out.println("B");
    }
}
