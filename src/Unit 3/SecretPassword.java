import java.util.*;

public class SecretPassword {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String password = userInput.next();
		while (!password.equals("coded")) {
			System.out.println("Enter Password: ");
			password = userInput.next();
		}
		System.out.println("Access Granted!");
		userInput.close();
	}
}	