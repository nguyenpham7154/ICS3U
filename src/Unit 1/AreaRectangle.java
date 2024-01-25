import java.util.*;

public class AreaRectangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my Area Program!");
        System.out.println("Enter the length: ");
        int length = scan.nextInt();
        System.out.println("Enter the width: ");
        int width = scan.nextInt();
        System.out.println("Area = "+ length*width);
        scan.close();
    }
}