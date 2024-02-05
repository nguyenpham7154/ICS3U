import java.util.*;

public class AssigningPartners {
	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) { 
		
		int n = userInput.nextInt();
		boolean consistent = true;
		String[][] student = new String[2][n];

		for (int i=0; i<2; i++) {
			for (int j=0; j<n; j++) {
				student[i][j] = userInput.next();
			}
		}
		
		for (int i=0; i<n; i++) {
			String s1 = student[0][i], s2 = student[1][i];
			if (s1.equals(s2)) {consistent = false; break;}
			for (int j=0; j<n; j++) {
				if (s1.equals(student[1][j]) && !s2.equals(student[0][j])) {
				    consistent = false; 
				    break;
				}
			}
		}
		
		if (consistent) System.out.println("good");
		else System.out.println("bad");
	}
}
