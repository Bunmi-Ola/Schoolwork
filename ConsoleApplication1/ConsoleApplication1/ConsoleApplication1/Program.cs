using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            //Based on c# 6 for programmers, Chapter 3.6

            // Declare local variables (Best do this all at the top of code block)
            double Number1;
            double Number2;
            double Sum;
            Int32 SumInt;

            //Alternatively: declare many on one line
            double Number1A, Number2A, SumA;

            //Get some Inputs
            Console.Write("Please enter number 1: ");
            //Number1 = double.Parse(Console.ReadLine());//read in from keyboard, convert string to double (book method)
                   Number1 = Convert.ToDouble(Console.ReadLine());//Net method

            Console.Write("Please enter number 2: ");
            //Number2 = double.Parse(Console.ReadLine());//read in from keyboard, convert string to double (book method)
            Number2 = Convert.ToDouble(Console.ReadLine());//Net method

            //Processing
            Sum = Number1 + Number2;  //Assign the LHS (Sum) the value of the reuslt
            SumInt = Convert.ToInt32(Sum); 

            //Output
            //Console.WriteLine(); //output a blank line a bit cude

            //Method 1-stringinterpolation - place $ outside start of string, then {}
            Console.WriteLine($"\n{Number1} + {Number2} = {Sum}");//excape n/n means new

            //Method 2-composite formatting, use {} to insert and format expressions
            // "String with patterns {}, list of values, count from 0
            Console.WriteLine("\n{0} + {1} = {2}:", Number1, Number2, Sum);// It mustn't start with zero and it can be any number but meaningful


            // Standard Numeric Format Strings
            // https://docs.microsoft.com/en-us/dotnet/standard/base-types/standard-numeric-format-strings

            //applies to both string and composite formatting
            Console.WriteLine("Different formats");
            Console.WriteLine("\nAs Integers {0:D5} + {1:D5} = {2:D5}", Convert.ToInt32(Number1), Convert.ToInt32(Number2), SumInt);
            Console.WriteLine("\nAs floating point {0:N5} + {1:N5} = {2:N5}", Number1, Number2, Sum);
            Console.WriteLine("\n{0} + {1} = {2}:", Number1, Number2, Sum);
            Console.WriteLine("\nAs Currency {0:C} + {1:C} = {2:C}:", Number1, Number2, Sum);


            Console.ReadKey(); //pause before exiting
        }
    }
}
