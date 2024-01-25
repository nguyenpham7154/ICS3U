import java.util.*;

public class LargerOf2Numbers {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = user_input.nextInt();
		System.out.println("Enter second number: ");
		int n2 = user_input.nextInt();
		
		if (n1>n2) { System.out.println("Result: "+ n1 +" is larger than "+ n2);}
		else if (n1<n2) { System.out.println("Result: "+ n2 +" is larger than "+ n1);}
		else {System.out.println("Result: The numbers are equal");}
        
		user_input.close();
	}
}