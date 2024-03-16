import java.util.*;

public class Scores {
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] occ = new int[11];
		int score = 1;
		double sum = 0.0, count = 0.0;
		
	    while (score > 0) {
	    	score = userInput.nextInt();
	    	if (score > 0 && score <= 10) {
	    		occ[score] ++;
	    		sum += score;
	    		count ++;
	    	}
	    }
	    System.out.println("Score   #Occurrences");

        for (int i = 1; i < 10; i++) {
            System.out.println(i + "       " + occ[i]);
        } 
		System.out.println(10 + "      " + occ[10]);
        double avg = Math.round(sum/count*10.0)/10.0;
        System.out.println("Mean: " + avg);
    }
}
