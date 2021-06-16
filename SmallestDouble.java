import java.util.Scanner;
public class SmallestDouble {

	public static void main(String[] args) {
	
	// invoke findSmallestDouble method	
		findSmallestDouble();

	}
	
	public static void findSmallestDouble() {
		// ask user to input how many numbers he/she wants to enter
		System.out.print("How many doubles will be entered?"); 
		Scanner userInput = new Scanner(System.in);
		int numTimes = userInput.nextInt(); // store the user input in the variable name numTimes    
		
		// ask user to input the first number in order to use it to compare with other numbers
		System.out.print("Enter a double: "); 
		Scanner firstDou = new Scanner(System.in); // store the number in the variable name firstDou
		double FirstDou = firstDou.nextDouble();
		double smallest = FirstDou; 
		// this line of code is use for comparing numbers
		for (int i=1; i<numTimes; i++) {
			System.out.print("Enter a double: ");
			Scanner userInputDou = new Scanner(System.in);
			double userDou = userInputDou.nextDouble();
			if (userDou < smallest) {
				smallest = userDou;
			}
		

	
		}
		System.out.println(smallest);
	}
}
	
