import java.util.*;

public class VariablesInput3 {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter four course grades: ");
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += user_input.nextInt();
		}
		double average = sum/4.0;
		System.out.print("The average is: " + average);
		user_input.close();
	}
}