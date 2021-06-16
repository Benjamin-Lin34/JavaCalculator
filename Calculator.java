import java.util.Scanner; // allows user to input
public class Calculator {

	public static void main(String[] args) {
		while (true) {  // while loop - until user enter Q or q the program stops
		System.out.print("Please select an operation { (A)addition; (S)subtraction; (M)multiplication; (D)division; or (Q)quit: ");// explaination of the the program 
		Scanner Option = new Scanner(System.in); // allows user to input the letter
		String UserOption = Option.next(); // store the input in the variable name UserOption
		if (UserOption.equals("Q") || UserOption.equals("q")) { // check if UserOption is Q or q
			System.out.print("Goodbye...");
			System.exit(0);
			}
		System.out.print("Enter the first operand: "); // allows user to input the first integer
		Scanner Fuserinput = new Scanner(System.in);
		double firstOperand = Fuserinput.nextDouble(); // store the input in the variable name firstOperand
		System.out.print("Enter the second operand: ");// allows user to input the second integer
		Scanner Suserinput = new Scanner(System.in);
		double secondOperand = Suserinput.nextDouble();// store the input in the variable name secondOperand
		
		// check if user's input, if match one of the conditions
		if(UserOption.equals("A") || UserOption.equals("a")) { 
			add(firstOperand, secondOperand);
		}
		if (UserOption.equals("S") || UserOption.equals("s")) {
			subtract(firstOperand, secondOperand);
		}
		if (UserOption.equals("M") || UserOption.equals("m")) {
			multiply(firstOperand, secondOperand);
		}
		if (UserOption.equals("D") || UserOption.equals("d")) {
			divide(firstOperand, secondOperand);
		}
		
		
		}
	}
	// this part does addition for the inputs
	public static void add(double x, double y) {
		double add = x + y;                              
		System.out.println(x + " + " + y + " = " + add);
		
	}
	// this part does subtraction for the inputs
	public static void subtract(double x, double y) {
		double subtract = x - y;
		System.out.println(x + " - " + y + " = " + subtract);
		
	}
	// this part does multiplication for the inputs
	public static void multiply(double x, double y) {
		double multiply = x * y;
		System.out.println(x + " * " + y + " = " + multiply);
		
	}
	// this part does division for the inputs
	public static void divide(double x, double y) {
		double divide = x / y;
		System.out.println(x + " / " + y + " = " + divide);
		
	}
}
