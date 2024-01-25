import java.util.*;

public class UsingArrays {
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {

        int[] sample = new int[10];
        
        for(int i = 0; i < 10; i++){
            sample[i] = userInput.nextInt();
        }
        
        int temp = sample[0];
        sample[0] = sample[9];
        sample[9] = temp;
        
        for(int i = 0; i < 10; i++){
            if(sample[i] < 0) sample[i] *= -1;
        }
        
        int sampleSum = 0;
        for(int i = 0;i < 10;i++){
            sampleSum += sample[i];
        }
        System.out.println(sampleSum);
        
        for(int i = 0; i < 10; i+=2){
        	System.out.print(sample[i] + " ");
        }
		
    }
}