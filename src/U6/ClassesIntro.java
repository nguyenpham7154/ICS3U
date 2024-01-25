import java.util.*;

// Q1 Fraction f = new Fraction();
// Q2 constructor is not called
// Q3 p = 1/3, q = 4/3, r = 4/3

// Q4
class Fraction {
    int num, den;
    public void print() {
        System.out.println(this.num + "/" + this.den);
    }
}

public class ClassesIntro {
    public static Scanner userInput = new Scanner(System.in);
    public static void main (String args[]) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        f1.num = userInput.nextInt();
        f1.den = userInput.nextInt();
        f2.num = userInput.nextInt();
        f2.den = userInput.nextInt();

        f1.num *= 2;
        f1.print();

        int t = f2.num;
        f2.num = f2.den;
        f2.den = t;
        f2.print();

        f1.num *= f2.num;
        f1.den *= f2.den;
        f1.print();

        t = f1.num * f2.den;
        f2.num *= f1.den;
        f2.den *= f1.den;
        f2.num += t;
        f2.print();

        f1.num = Math.abs(f1.num);
        f1.den = Math.abs(f1.den);
        f1.print();
    }
}
