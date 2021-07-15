// Demonstrate the exception handling in Java

import java.io.*;

public class UsingExcept
{
        public static void main(String args[]) throws IOException
        {
                int num1, num2;
                double result;

                BufferedReader stdin = new BufferedReader
                (new InputStreamReader (System.in));

                System.out.println("Enter two integers in two separate lines: ");

                num1 = Integer.parseInt(stdin.readLine());
                num2 = Integer.parseInt(stdin.readLine());
                try{
                        result = quotient(num1, num2);	// method quotient throws an exception
                        System.out.println("The quotient is: " + result);
                }
                catch (DivideByZeroException ex){
                        System.out.println("Exception occured: " +  ex.getMessage());
                }
        } // end main()
	
	// This method needs to claim the exception.
        public static double quotient(int num1, int num2) throws DivideByZeroException
        {
                if(num2 == 0)	//Throw an object of the exception
                        throw new DivideByZeroException("Denominator cannot be zero!");

                return (double) num1 / num2;
        }
} // end class Except

