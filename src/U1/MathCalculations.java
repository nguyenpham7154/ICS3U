import java.util.*;

public class MathCalculations {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Square Root");
        System.out.println("Input a positive number: ");
        int int1 = user_input.nextInt();
        System.out.print("The square root of " +int1+ " is " +Math.sqrt(int1)+ "\n\n****\n\n");
		
        System.out.println("Exponents");
        System.out.println("Input an integer: ");
        int int2 = user_input.nextInt();
        System.out.println("Input a second integer: ");
        int int3 = user_input.nextInt();
        System.out.print(int2 + " to the power of " + int3 + " is: " + Math.pow(int2, int3) + "\n\n****\n\n");
        
        System.out.println("Rounding, Ceiling and Floor");
        System.out.println("Input a decimal value: ");
        double db = user_input.nextDouble();
        System.out.println(db + " rounds to " + Math.round(db));
        System.out.println(db + " ceiling is " + Math.ceil(db));
        System.out.print(db + " floor is " + Math.floor(db) + "\n\n****\n\n");
        
        System.out.println("Random");
        System.out.println("Enter the lower limit: ");
        int lowerlimit = user_input.nextInt();
        System.out.println("Enter the upper limit: ");
        int upperlimit = user_input.nextInt();
        System.out.println("A random number between " +lowerlimit+ " and " +upperlimit+ " is " + (Math.floor(Math.random()*(upperlimit-lowerlimit)+lowerlimit)) );
        
		user_input.close();
	}
}