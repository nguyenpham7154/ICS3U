import java.util.*;

class Child {
    private int height;
    private double mass;

    public Child (int h, double m) {
        this.height = h;
        this.mass = m;
    }

    public Boolean equals (Child other) {
        if (Math.abs(this.height - other.height) <= 2 && Math.abs(this.mass - other.mass) <= 0.5)
            return true;
        return false;
    }

    public String toString() {
        if (this.mass/(this.height * this.height /10000.0) > 18.0)
            return  "Child - good";
        else return "Child - bad";
    }
}

public class ComparingDisplayingObjects {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Child child1 = new Child(s.nextInt(), s.nextDouble());
        Child child2 = new Child(s.nextInt(), s.nextDouble());
        Child child3 = new Child(s.nextInt(), s.nextDouble());
        System.out.println("Child 1 vs Child 2 - " + child1.equals(child2));
        System.out.println("Child 2 vs Child 3 - " + child2.equals(child3));
        System.out.println("Child 3 vs Child 1 - " + child3.equals(child1));

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }
}
