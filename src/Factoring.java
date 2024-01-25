import java.util.*;

public class Factoring {
	static Scanner userInput = new Scanner(System.in);
	
	static int gcd (int n1, int n2) {
		n1 = Math.abs(n1); n2 = Math.abs(n2);
		for (int f = Math.max(n1, n2); f >= 1; f--) 
			if (n1 % f == 0 && n2 % f == 0) return f;
		return 1;
	}
	
	public static void main(String[] args) {
		int a = userInput.nextInt(), b = userInput.nextInt(), c = userInput.nextInt();
		int cf = gcd(gcd(a, b), c); if (a < 0) cf *= -1;
		
		if (c == 0) {
			System.out.println(
			((cf == 1)? "" : (cf == -1)? "-" : cf) + "x(" + 
			((a/cf == 1)? "" : (a/cf)) + "x" + ((b/cf < 0)? "" : "+") + (b/cf) + ")");
		} else {
			String f1, f2;
			a /= cf; b /= cf; c /= cf;
			
			double D = b*b - 4.0*a*c;
			double x1 = (-b - Math.sqrt(D)) / (2.0*a);
			double x2 = (-b + Math.sqrt(D)) / (2.0*a);
			int coe1 = 1, coe2 = a;
			
			for (int i = 1; i <= a; i++) {
				if (a % i != 0) continue;
				int c1 = i, c2 = a/i;
				if (Math.round(c1*x1) * Math.round(c2*x2) == c) {coe1 = c1; coe2 = c2;};
			}
			
			f1 = "("+ ((coe1 == 1)? "" : coe1) + "x" + ((-x1 < 0)? "" : "+") + (int)(coe1*-x1) + ")";
			f2 = "("+ ((coe2 == 1)? "" : coe2) + "x" + ((-x2 < 0)? "" : "+") + (int)(coe2*-x2) + ")";
			
			System.out.println(((cf == 1)? "" : (cf == -1)? "-" : cf) + ((x1 < x2)? f1 + f2 : f2 + f1));
		}	
    }
}
