import java.util.*;

public class VariablesInput2 {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter your mass: ");
		double myMass = user_input.nextDouble();
		System.out.print("Your mass is " + myMass + " kg.");
		user_input.close();
	}
}