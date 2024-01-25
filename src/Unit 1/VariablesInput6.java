import java.util.*;

public class VariablesInput6 {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Where were you born?  Enter a string value: ");
		String birthplace = user_input.nextLine();
		System.out.println("What is your middle initial? Enter a character: ");
		char initial = user_input.nextLine().charAt(0);
		System.out.println("What year were you born?  Enter the 4 digit integer value: ");
		int birthyear = user_input.nextInt();
		System.out.println("Pick a number between 16 and 17.  Enter the decimal number: ");
		double numberPicked = user_input.nextDouble();
		System.out.println("Thank you for your input.");
		System.out.println(birthplace + " is beautiful.");
        System.out.println(initial + ", can I call you, \""+initial+"\" - I think you must be " + birthyear + " + "+numberPicked+" years old and attend \"Colonel By\".");
		user_input.close();
	}
}