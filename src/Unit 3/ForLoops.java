import java.util.*;

public class ForLoops {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter integer 1: ");
		int num1 = userInput.nextInt();
		System.out.println("Enter integer 2: ");
		int num2 = userInput.nextInt();
				
		System.out.println("Print asterisks: ");
		for (int i=0; i<Math.abs(num1-num2); i++) {
			System.out.print("*");
		}
		
		int n1, n2;
		if (num1>num2) {n1 = num1; n2 = num2;}
		else {n1 = num2; n2 = num1;}
		System.out.println("\nCountdown seconds: ");
		for (int i=n1; i>=n2; i--) {
			System.out.println(i +" seconds");
		}
		
		System.out.println("Enter a letter: ");
		char char1 = userInput.next().charAt(0);
		System.out.println("Enter a letter: ");
		char char2 = userInput.next().charAt(0);
		
		char c1, c2;
		if (char1>char2) {c1 = char1; c2 = char2;}
		else {c1 = char2; c2 = char1;}
		for (char i=c2; i<=c1; i++) {
			System.out.println("Give me a " +i);
		}
				
		System.out.println("Output multiples - start at integer 1 and multiply by integer 2 stop when greater than 1000 ");
		while(num1 < 1000){
			System.out.println(num1);
			num1 *= num2;
		}
		
		userInput.close();
	}
}