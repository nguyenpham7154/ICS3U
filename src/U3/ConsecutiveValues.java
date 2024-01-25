import java.util.*;

public class ConsecutiveValues {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int x, y, counter=0;
		x = userInput.nextInt();
		y = x;
		while (x!=0) {
			x = userInput.nextInt();
			if (x==y) counter++;
			y = x;
		}
		System.out.println("There are " +counter+ " cases of consecutive values");
		userInput.close();
	}
}