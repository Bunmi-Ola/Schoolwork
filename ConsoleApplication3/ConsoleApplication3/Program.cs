using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication3
{
    class Program
    {
        static void Main(string[] args)
        {
        
                string[] friendNames = { "Robert Barwell",
                                     "Mike Parry",
                                     "Jeremy Beacock",
                                     "Bill Smith" };
                //int i; better to declare in for loop
                Console.WriteLine("Method 1: for loop");
                Console.WriteLine("Here are {0} of my friends:", friendNames.Length);

                // use var keyword to let C# infer the type (type inference)
                // array length = # elements = upperbound (i.e. last index) + 1
                // note use < to avoid going off the end of the array
                // always use the .Length property, never hard code an upperbound
                for (var i = 0; i < friendNames.Length; i++)
                {
                    // reference the ith element of array as friendNames[i] 
                    Console.WriteLine("Element={0} Name={1}", i, friendNames[i]);
                }

                Console.WriteLine("\nMethod 2: foreach loop");
                Console.WriteLine("Here are {0} of my friends:", friendNames.Length);

                int j = 0;
                foreach (string Name in friendNames)
                {
                    Console.WriteLine("Element={0} Name={1}", j, Name);
                    j++; // if needed we make our own indices
                }



                Console.ReadKey();
            }
        }
    }
