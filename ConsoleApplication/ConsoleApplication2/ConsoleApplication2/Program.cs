using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            //Based on C# 6 for Programmers, Chapter 3.6

            // Declare local variables (Best do this all at the top of code block)
            double Number1; // decribe this var ..
            double Number2; // All floating point values
            double Sum;
            Int32 SumInt;


            //Alternatively: declare many on one line
            double Number1A, Number2A, SumA;

            // Get some Inputs
            Console.Write("Please enter number 1: ");
            //Number1 = Double.Parse(Console.ReadLine()); // read in from keyboard, convert string to double (textbook)
            Number1 = Convert.ToDouble(Console.ReadLine()); // .NET method

            Console.Write("Please enter number 2: ");
            //Number1 = Double.Parse(Console.ReadLine()); // read in from keyboard, convert string to double (textbook)
            Number2 = Convert.ToDouble(Console.ReadLine()); // .NET method

            //Processing
            Sum = Number1 + Number2;  // Assign the LHS (Sum) the value of the result of the expression on the RHS
            SumInt = Convert.ToInt32(Sum); // take an integer version of sum


            //Output
            //Console.WriteLine(); //output a blank line a bit crude

            // Method 1- string interpolation - place $ outside start of string, then {} insert expressions
            Console.WriteLine($"\n{Number1} + {Number2} = {Sum}"); // escape n \n means new line

            // Method 2- Composite Formatting, use {} to insert and format expressions 
            // "String with patterns {}", list of values, count from 0
            Console.WriteLine("\n{0} + {1} = {2}", Number1, Number2, Sum); // escape n \n means new line


            // Standard Numeric Format Strings
            // https://docs.microsoft.com/en-us/dotnet/standard/base-types/standard-numeric-format-strings

            //Applies to both string interpolation and composite formatting
            Console.WriteLine("/nDifferent formats");
            // N (Number) format fixed decimal digits 
            Console.WriteLine("\nAs Floating point {0:N5} + {1:N5} = {2:N5}", Number1, Number2, Sum); // escape n \n means new line

            // D (decimal) format for min integer digits  variables only       
            Console.WriteLine("\nAs Integers {0:D7} + {1:D7} = {2:D7}", Convert.ToInt32(Number1), Convert.ToInt32(Number2), SumInt); // escape n \n means new line

            // formats C (currency) in the windows regional settings
            Console.WriteLine("\nAs Currency {0:C} + {1:C} = {2:C}", Number1, Number2, Sum); // escape n \n means new line



            Console.ReadKey(); // pause before exiting


        }
    }
}
