import java.util.*;

public class TimesTable {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int n = userInput.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}		
		userInput.close();
	}
}
