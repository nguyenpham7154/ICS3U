import java.util.*;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a positive number (or negative number to quit):");
		double num = userInput.nextDouble();
		while (num > 0) {
			double root = Math.round(1000.0*Math.sqrt(num))/1000.0;
			System.out.println("Square root is: "+ root +"\n");
			System.out.println("Enter a positive number (or negative number to quit):");
			num = userInput.nextDouble();
		}
		userInput.close();
	}
}