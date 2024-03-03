import java.util.*;

public class SizeMultiDim {
	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) { 
        int size = 0;
        int n = userInput.nextInt();
        
        for (int i=0; i<n; i++) {
        	int x = 0;
        	while (x != -1) {
        		x = userInput.nextInt();
		        for (int j=0; j<x; j++) {
		        	userInput.nextInt();
		        	size += 1;
		        }
	        }
        }
        System.out.println(size);
    }
}
