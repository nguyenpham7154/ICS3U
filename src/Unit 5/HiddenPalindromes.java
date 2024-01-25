import java.util.*;

public class HiddenPalindromes {
	public static Scanner userInput = new Scanner(System.in);
	
    public static void main(String[] args) {
        String str = userInput.nextLine();
        
        int n = str.length();
        int maxLength = 1;
 
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                
            	Boolean match = true;
            	
                for (int k=0; k < (j - i + 1)/2; k++) {
                    if (str.charAt(i + k) != str.charAt(j - k)) match = false;
                }
 
                if (match && (j - i + 1) > maxLength) maxLength = j - i + 1;
            }
        }
        
        System.out.print(maxLength);
    }
}
