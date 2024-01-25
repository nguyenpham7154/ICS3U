import java.util.*;

public class PrintRectHollow { 
    public static void printRectHollow(char c, int width, int height){
        for(int i=0; i < height; i++){
            if(i == 0 || i == height - 1){
                for(int j = 0;j < width;j++){
                    System.out.print(c);
                }
            } else {
                for(int j=0; j < width; j++){
                    if(j == 0 || j == width - 1){
                        System.out.print(c);
                    } else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        char c = userInput.next().charAt(0);
        int w = userInput.nextInt();
        int h = userInput.nextInt();
        printRectHollow(c, w, h);
        userInput.close();
    }
}