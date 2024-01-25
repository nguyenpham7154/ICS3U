import java.util.*;

public class SizeMultiDim {
	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) { 
        Vector<Integer> arr = new Vector<Integer>();
        int n = userInput.nextInt();
        
        for (int i=0; i<n; i++) {
        	int x = 0;
        	while (x != -1) {
        		x = userInput.nextInt();
		        for (int j=0; j<x; j++) {
		        	int y = userInput.nextInt();
		        	arr.add(y);
		        }
	        }
        }
        System.out.println(arr.size());
    }
}
