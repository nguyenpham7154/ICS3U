import java.util.*;

class Fraction {
    int num, den;

    public Fraction() {
        this.num = 0;
        this.den = 1;
    }

    public Fraction (int n, int d) {
        if (d > 0) {
            this.num = n;
            this.den = d;
        } else if (d < 0) {
            this.num = -n;
            this.den = -d;	
        } else {
            this.den = 1;
            this.num = n;
        }
    }

    public static int gcd (int n1, int n2) {
        n1 = (int) Math.abs(n1);
        n2 = (int) Math.abs(n2);
        if (n1 < n2) return gcd(n2, n1);
        if (n2 == 0) return n1;
        else return gcd(n2, n1 % n2);
    }

    public void reduce() {
        int cf = gcd(this.num, this.den);
        this.num /= cf;
        this.den /= cf;
    }

    public static Fraction product (Fraction f1, Fraction f2) {
        Fraction result = new Fraction();
        result.num = f1.num * f2.num;
        result.den = f1.den * f2.den;
        result.reduce();
        return result;
    }

    public static Fraction abs (Fraction f) {
        Fraction result = new Fraction();
        result.num = (int) Math.abs(f.num);
        result.den = (int) Math.abs(f.den);
        result.reduce();
        return result;
    }

    public static Boolean isPositive (Fraction f) {
        if (f.num > 0 && f.den > 0) return true;
        return false;
    }

    public void print() {
        System.out.println(this.num + "/" + this.den);
    }
}

public class FractionClassMethods {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Fraction p = new Fraction(s.nextInt(), s.nextInt());
        Fraction q = new Fraction(s.nextInt(), s.nextInt());
        Fraction.product(p, q).print(); 
        Fraction.abs(q).print();

        System.out.println(Fraction.isPositive(p));
        System.out.println(Fraction.isPositive(q));
    }
}
