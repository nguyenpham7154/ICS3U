import java.util.*;

public class MaxMultiDim {
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) { 
		int r = userInput.nextInt();
		int max = Integer.MIN_VALUE;
		
		for (int i=0; i<r; i++) {
			int c = userInput.nextInt();
			for (int j=0; j<c; j++) {
				int in = userInput.nextInt();
				if (in > max) max = in;
			}
		}
		System.out.println(max);
	}
}
