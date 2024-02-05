import java.util.*;

public class OverloadingRandomNum {
	public static Scanner userInput = new Scanner(System.in);
	
	public static int randomNumber() {
		return (int) Math.floor(Math.random() * 6) + 1;
	}
    public static int randomNumber(int n) {
		return (int) Math.floor(Math.random() * n) + 1;
	}
    public static int randomNumber(int low, int high) {
		return (int) Math.floor(Math.random() * (high - low + 1)) + low;
	}
    public static int randomNumber(int low, int high, int step) {
		return (int) Math.floor(Math.random() * ((high - low)/step) + 1) * step + low;
	}
	public static void main(String[] args) {
		int n = userInput.nextInt();
		int low = userInput.nextInt();
		int high = userInput.nextInt();
		int step = userInput.nextInt();
		
		System.out.println(randomNumber());
		System.out.println(randomNumber(n));
		System.out.println(randomNumber(low, high));
		System.out.println(randomNumber(low, high, step));
    }
}