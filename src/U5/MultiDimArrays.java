import java.util.*;

public class MultiDimArrays {
	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) { 
        
		int r = userInput.nextInt();
		int c = userInput.nextInt();
		int[][] a = new int[r][c];
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				a[i][j] = userInput.nextInt();
			}
		}
		
		for (int i=c-1; i>=0; i--) {
			for (int j=r-1; j>=0; j--) {
				System.out.print(a[j][i]);
			} System.out.println();
		}
    }
}
