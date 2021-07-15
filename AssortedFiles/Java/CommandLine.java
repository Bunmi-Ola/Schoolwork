// This project demonstrates displaying of input and output messages
// on a DOS command window.
// To make the input process simpler, a user-defined class MyInput is given
// and should be added to the current project.
// The following Java program asks the user for two numbers and return the sum.

class CommandLine
{
	public static void main(String[] args)
	{
		double firstNum, secondNum, sum;
		
		System.out.print("Please enter the first number: " );
		
		// Read in the user's input using the method defined in MyInput.java
		firstNum = MyInput.readDouble();
		
		System.out.print("Please enter the second number: " );
		
		secondNum = MyInput.readDouble();
		
		// Calculate the sum
		sum = firstNum + secondNum;
		
		// Display the result on the DOS command window
		System.out.println("The sum of " + firstNum + " + " + secondNum 
							+ " is: " + sum);
	}
}
