import java.util.*;

public class FindLargest {
	public static Scanner userInput = new Scanner(System.in);
	
	public static double findLargest(double x, double y, double z) {
		if (x > y && x > z)
		    return x;
		else if (y > z)
		    return y;
		else
			return z;
	}
	
	public static void main(String[] args) {
		
		double x = userInput.nextDouble();
	    double y = userInput.nextDouble();
	    double z = userInput.nextDouble();

	    System.out.println(findLargest(x, y, z));
		
    }
}