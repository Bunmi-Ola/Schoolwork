// This project demonstates displaying input and output messages on a message
// dialogue box instead of a DOS command window.
// To do this, you need to import the javax.swing.JOptionPane package.
// If you are reading a number from the keyboard, you also need to convert 
// the user's input from a string to a numerical type because by default, 
// everything is read as a string.

// The following program asks the user for two numbers and display the sum.

import javax.swing.JOptionPane;

public class MessageBox
{
	public static void main(String[] args)
	{
		// Declare variables
		String firstString, secondString;
		double firstNum, secondNum, sum;
		
		// Ask for the first number and read it as a string
		firstString = JOptionPane.showInputDialog(null, 
												  "Enter the first number:", 
												  "Input dialogue box", 
												 JOptionPane.QUESTION_MESSAGE);
		
		// Ask for the second number and read it as a string
		secondString = JOptionPane.showInputDialog(null, 
												  "Enter the second number:", 
												  "Input dialogue box", 
												 JOptionPane.QUESTION_MESSAGE);
												 
		// convert the two strings to their numerical equivalent
		firstNum = Double.parseDouble(firstString);
		secondNum = Double.parseDouble(secondString);
		
		// Calculate the sum
		sum = firstNum + secondNum;
		
		// Display the result on a message box
		JOptionPane.showMessageDialog(null, "The result is: " + sum,
									  "Output dialogue box",
									  JOptionPane.INFORMATION_MESSAGE);
	}
}