import java.util.Scanner;
public class Summation {

	public static void main(String[] args) {
		// invoke the sumIntegers method
		sumIntegers();
	}
	
	
	public static void sumIntegers() {
		// ask user to input two numbers, then gives the output of the sum of these two numbers
		System.out.print("How many integers will be summed? ");
		Scanner userInput = new Scanner(System.in);
		int numTimes = userInput.nextInt();
		int sum = 0;
		for (int i=0; i<numTimes; i++) {
			System.out.print("Enter an integer: ");
			Scanner userInputInt = new Scanner(System.in);
			int userInt = userInputInt.nextInt();
			sum = sum + userInt;
		}
		System.out.println("The Summation is: " + sum);
	}
}
