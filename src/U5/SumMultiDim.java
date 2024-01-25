import java.util.*;

public class SumMultiDim {
	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) { 
		int r = userInput.nextInt();
		int c = userInput.nextInt();
		int sum = 0;
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				sum += userInput.nextInt();
			}
		}
		System.out.println(sum);
    }
}
