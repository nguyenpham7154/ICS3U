import java.util.*;

public class VariablesInput4 {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		double markTotal = 0;
		double average = 0;
		System.out.println("Enter mark 1: ");
		double mark1 = user_input.nextDouble();
		markTotal += mark1;
		System.out.println("Marks: " + mark1);
		
		System.out.println("Enter mark 2: ");
		double mark2 = user_input.nextDouble();
		markTotal += mark2;
		System.out.println("Marks: " + mark1 + ", " + mark2);
		System.out.println("Mark total is " + markTotal);
		
		System.out.println("Enter mark 3: ");
		double mark3 = user_input.nextDouble();
		markTotal += mark3;
		System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
		System.out.println("Mark total is " + markTotal);
		
		System.out.println("Enter mark 4: ");
		double mark4 = user_input.nextDouble();
		markTotal += mark4;
		System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3 + ", " + mark4);
		System.out.println("Mark total is " + markTotal);
		average = markTotal/4.0;
		System.out.print("The average is " + average);
		
		user_input.close();
	}
}