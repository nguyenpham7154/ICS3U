import java.util.*;

public class PrintRect {
	public static Scanner userInput = new Scanner(System.in);
	
	public static void printRect (char c, int width, int height) {
		for (int i=0; i<height; i++) {
			for (int j=0; j<width; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		char c = userInput.next().charAt(0);
		int w = userInput.nextInt();
		int h = userInput.nextInt();
		printRect(c, w, h);
		
    }
}