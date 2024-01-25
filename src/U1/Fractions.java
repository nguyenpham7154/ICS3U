import java.util.*;

public class Fractions {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("numerator= ");
		int n = user_input.nextInt();
		System.out.println("denominator= ");
		int d = user_input.nextInt();
		System.out.print(n +" / "+ d +" is equivalent to "+ (int)Math.floor(n/d) +" and "+ n%d +" / "+ d);
        user_input.close();
	}
}