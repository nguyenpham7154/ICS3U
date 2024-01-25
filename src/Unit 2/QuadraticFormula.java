import java.util.*;

public class QuadraticFormula {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter quadratic equation a, b and c");
		int a = user_input.nextInt();
		int b = user_input.nextInt();
		int c = user_input.nextInt();
		double x1 = 0.0, x2 = 0.0;
		double D = b*b - 4.0*a*c;
		
		if(D > 0){
            x1 = (-b + Math.sqrt(D))/(2.0*a);
            x1 = Math.round(x1*10)/10.0;
            x2 = (-b - Math.sqrt(D))/(2.0*a);	
            x2 = Math.round(x2*10)/10.0;
            if (x1<x2) {System.out.println("This has two solutions x=" +x1+ " and x=" +x2);}
            else {System.out.println("This has two solutions x=" +x2+ " and x=" +x1);}
        } else if (D == 0) {
            x1 = (-1*b/2*a);
            x1 =  Math.round(x1*10)/10;
            System.out.println("This has one solution x=" +x1);
        } else {
            System.out.println("This has no solution");
        }
        
		user_input.close();
	}
}
