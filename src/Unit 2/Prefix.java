import java.util.*;

public class Prefix {
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		String input = userInput.nextLine();
		Stack<String> stack = new Stack<String>();	
		
		while (!input.equals("0")) {	
			for (int i = input.length()-1; i >= 0; i--) {
				char c = input.charAt(i);
				if (c == ' ') continue;
				else if (c == '+' || c == '-') {
					String x = stack.pop();
					String y = stack.pop();
					stack.push(x + " " + y + " " + c);
				}
				else stack.push(String.valueOf(c));
			}
			
			System.out.println(stack.pop());
			input = userInput.nextLine();
		} 
    }
}
