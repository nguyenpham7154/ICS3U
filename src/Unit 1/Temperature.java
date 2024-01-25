import java.util.*;

public class Temperature {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Temp in F: ");
		double F = user_input.nextDouble();
		double C = Math.round(5.0/9*(F-32.0)*10)/10.0;
		System.out.println("Temp in C: \n" + C);
        user_input.close();
	}
}