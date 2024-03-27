import java.util.*;

public class TreasureHunt {
    public static String[][] map = new String[6][8];
    
    // Prints out map
    public static void printMap() {
        System.out.println();
        System.out.print("+ ");

        for (int a = 1; a <= 7; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void game() {
        int count = 0;
        // Gets random coordinates for treasure
        int random1 = (int) Math.floor(Math.random() * 5) + 1;
        int random2 = (int) Math.floor(Math.random() * 7) + 1;
        Boolean found = false;
        
        // fills array with "*"
        for (int i = 1; i < 6; i++) {
            Arrays.fill(map[i], (String) "*");
        }

        printMap();

        while (!found) {
            System.out.println("Please enter coordinates (r, c)");
            int input1 = keyboard.nextInt();
            int input2 = keyboard.nextInt();
            map[input1][input2] = "O";
            count++;

            // End game when treasure is found
            if (input1 == random1 && input2 == random2) {
                System.out.println("You won! :D");
                System.out.println("Your number of tries are: " + count);
                map[input1][input2] = "X";
                found = true;
            } else {
                // Compares coordinates to get distance and direction to treasure 
                int dx = input1 - random1;
                int dy = input2 - random2;
                String dirx = "";
                String diry = "";

                if (dx < 0) dirx = -dx + " units down";
                else dirx = dx + " units up";
                if (dy < 0) diry = -dy + " units right";
                else diry = dy + " units left";

                System.out.println("treasure is " + dirx + " and " + diry);
            }
            
            printMap();
            if (found) return;
        }
    }

    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            game();
            System.out.println("enter 0 to start new game, -1 to exit");
            if (keyboard.nextInt() == -1) break;
        }   
    }
}