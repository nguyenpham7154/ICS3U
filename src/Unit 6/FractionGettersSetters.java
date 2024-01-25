import java.util.*;

class Fraction {
    int num, den;

    public Fraction() {
        this.num = 0;
        this.den = 1;
    }

    public Fraction (int n, int d) {
        if (d >= 0) {
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

    public int getNumerator() {
        return this.num;
    }
    
    public int getDenominator() {
        return this.den;
    }

    public void setNumerator (int newNum) {
        this.num = newNum;
    }

    public void setDenominator(int newDen) {
        if (newDen >= 0) {
            this.den = newDen;
        } else {
            this.den = -newDen;
            this.num = -this.num;
        }
    }

    public void invert () {
        int t = this.num;
        this.num = this.den;
        this.den = t;
        if (this.den < 0) {
            this.num *= -1;
            this.den *= -1;
        }
    }

    public void print() {
        System.out.println(this.num + "/" + this.den);
    }
}

public class FractionGettersSetters {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int [] nums = new int[4];
        int [] dens = new int[4];

        for (int i = 0; i < 4; i++){
            nums[i] = s.nextInt();
            dens[i] = s.nextInt();
        }

        Fraction a = new Fraction(nums[0], dens[0]);
        Fraction b = new Fraction(nums[1], dens[1]);
        Fraction c = new Fraction();
        Fraction d = new Fraction();

        System.out.println(a.getNumerator());
        System.out.println(a.getDenominator());
        System.out.println(b.getNumerator());
        System.out.println(b.getDenominator());

        c.setNumerator(nums[2]);
        c.setDenominator(dens[2]);
        d.setNumerator(nums[3]);
        d.setDenominator(dens[3]);

        d.invert();

        a.print();
        b.print();
        c.print();
        d.print();
    }
}