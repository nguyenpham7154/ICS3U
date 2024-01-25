import java.util.*;

// Q1 
// a) q
// b) q
// c) p
// d) p
// e) p

//Q2
class Fraction {
    int num, den;

    public void plusEquals(Fraction other) {
        this.num = this.num * other.den + other.num * this.den;
        this.den *= other.den;
    }

    public Fraction plus(Fraction other) {
        Fraction f = new Fraction();
        f.num = this.num * other.den + other.num * this.den;
        f.den = this.den * other.den;
        return f;
    }

    public static int gcd(int n1, int n2) {
        if (n1 < n2) return gcd(n2, n1);
        if (n2 == 0) return n1;
        else return gcd(n2, n1 % n2);
    }

    public void reduce() {
        int cf = gcd(this.num, this.den);
        this.num /= cf;
        this.den /= cf;
    }

    public void print() {
        System.out.println(this.num + "/" + this.den);
    }

    // --------- EXAMPLE ---------
    public double size() {
        return Math.abs((double) num / den);
    }

    public boolean isLargerThan(Fraction other) {
        if (this.size() >= other.size()) return true;
        else return false;
    }

    public void timesEquals(Fraction p) {
        this.num *= p.num;
        this.den *= p.den;
    }

    public Fraction times(Fraction other) {
        Fraction result = new Fraction();
        result.num = this.num * other.num;
        result.den = this.den * other.den;
        return result;
    }
}

public class FractionInstance {
    public static Scanner userInput = new Scanner(System.in);
    public static void main (String args[]) {
		Fraction a = new Fraction();
        Fraction b = new Fraction();
        Fraction c = new Fraction();
        Fraction d = new Fraction();

        a.num = userInput.nextInt();
        a.den = userInput.nextInt();
        b.num = userInput.nextInt();
        b.den = userInput.nextInt();
        c.num = userInput.nextInt();
        c.den = userInput.nextInt();
		
        a.plusEquals(b);
        d = a.plus(c);
        d.reduce();

        a.print();
        b.print();
        c.print();
        d.print();
	}
}
