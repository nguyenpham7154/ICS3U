import java.util.*;

public class InClassAssignment {
    public static Scanner userInput = new Scanner(System.in);

    public static double addThem(double a, double b) {
        return a + b;
    }

    public static boolean isValid(int x) {
        return (1 <= x && x  <= 100)? true : false;
    }

    public static String coinFlip(int y) {
        return (y % 2 == 0)? "heads" : "tails";
    }

    public static void printStack(int s, char c) {
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 412 all
        double x = userInput.nextDouble();
        double y = userInput.nextDouble();

        int num = (int) addThem(x, y);
        String result = coinFlip(num);
        char c = result.charAt(0);

        if (isValid(num)) printStack(num, c);
        else System.out.println("Invalid");

        // 412e
        double u = userInput.nextDouble();
        double sum = u;

        if (u > 0) {
            u = userInput.nextDouble();
            if (u > 0) while (u > 0) {
                sum = addThem(sum, u);
                System.out.println(sum);
                u = userInput.nextDouble();
            }
            else System.out.println(sum);
        }
    }
}