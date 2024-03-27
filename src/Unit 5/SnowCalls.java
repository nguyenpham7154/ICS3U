import java.util.*;

public class SnowCalls {
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) { 
		int n = userInput.nextInt();
		String[] value = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		String[] input = new String[n];
		String[] output = new String[n];
		
		for (int i = 0; i < n; i++) {
			input[i] = userInput.next().replace("-", "");
		}

		for (int i = 0; i < n; i++) {
			output[i] = "";
			for (int j = 0; j < 10; j++) {
				if (output[i].length() == 3 || output[i].length() == 7)
					output[i] += "-";
				if (Character.isDigit(input[i].charAt(j)))
					output[i] += input[i].charAt(j);
				else
					for (int x = 0; x < 8; x++) {
						if (value[x].indexOf(input[i].charAt(j)) != -1)
							output[i] += (x + 2);
					}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(output[i]);
		}
	}
}
