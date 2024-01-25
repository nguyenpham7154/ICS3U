import java.util.*;

public class Rank3Numbers {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter 3 integer values: ");
		int n1 = user_input.nextInt();
		int n2 = user_input.nextInt();
		int n3 = user_input.nextInt();
		int max = 0, mid = 0, min = 0;
		
		max = n3;
		if (n1>n3 || n2>n3) {
		    if (n1>n2) {
		    	max = n1;
		    } else {
		    	max = n2;
		    }
		}
		
		min = n3;
		if (n1<n3 || n2<n3) {
		    if (n1<n2) {
		    	min = n1;
		    } else {
		    	min = n2;
		    }
		}
		
		mid = n1+n2+n3-max-min;
		
		System.out.println(min +", "+ mid +", "+ max);
		
		user_input.close();
	}
}
