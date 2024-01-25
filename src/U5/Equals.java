import java.util.*;

public class Equals {
	
	public static boolean equals(double[] a, double[] b) {
		if  (a.length != b.length) return false;
		for (int i=0; i<a.length; i++) {
			if (a[i] != b[i]) return false;
		}
		return true;
	}
	
	public static double[] getArray(int n) {
		   double [] temp = new double[n];
		   for(int x=0; x<n; x++){
		     temp[x] = userInput.nextDouble();
		   }
		   return temp;
	}
	
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		
	    int n = userInput.nextInt();
	    double [] myArray = getArray(n);
	    int n2 = userInput.nextInt();
	    double [] myArray2 = getArray(n2);
	    System.out.println(equals(myArray, myArray2));
		
    }
}