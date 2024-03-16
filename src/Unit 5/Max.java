import java.util.*;

public class Max {
	public static double[] getArray(int n) {
		   double [] temp = new double[n];
		   for(int x=0; x<n; x++){
		     temp[x] = userInput.nextDouble();
		   }
		   return temp;
	}
	
	public static double max(double [] arr) {
		double max = 0.0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
		return max;
	}
	
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		int n = userInput.nextInt();
	    double [] myArray = getArray(n);

	    System.out.println(max(myArray));
		
    }
}
