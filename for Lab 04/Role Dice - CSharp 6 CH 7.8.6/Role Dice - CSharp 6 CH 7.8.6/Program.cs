using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Role_Dice___CSharp_6_CH_7._8._6
{
    class Program
    {
        static void Main(string[] args)
        {
            Random randomNumbers = new Random(); // random-number generator
            long NumRolls, ExpectedFrequency;

            string Continue = "y";

            //repeat while user types "y" at end
            while (Continue == "y")
            {
                // reset out frequency counters
                long frequency1 = 0; // count of 1s rolled
                long frequency2 = 0; // count of 2s rolled
                long frequency3 = 0; // count of 3s rolled
                long frequency4 = 0; // count of 4s rolled
                long frequency5 = 0; // count of 5s rolled
                long frequency6 = 0; // count of 6s rolled



                //Input Number of Rolls required
                Console.Write("How many rolls shall we make? ");
                NumRolls = Convert.ToInt64(Console.ReadLine());

                ExpectedFrequency = NumRolls / 6;

                // output Starting Message
                Console.WriteLine("\nBeginning {0} rolls...", NumRolls);
                Console.WriteLine("\nExpected Frequencies: {0}\n", ExpectedFrequency);

                // summarize results of 60,000,000 rolls of a die
                for (long roll = 1; roll <= NumRolls; ++roll)
                {
                    int face = randomNumbers.Next(1, 7); // number from 1 to 6

                    // determine roll value 1-6 and increment appropriate counter

                    if (face == 1)
                    {
                        ++frequency1; // increment the 1s counter
                    }
                    else if (face == 2)
                    {
                        ++frequency2; // increment the 2s counter
                    }
                    else if (face == 3)
                    {
                        ++frequency3; // increment the 3s counter
                    }
                    else if (face == 4)
                    {
                        ++frequency4; // increment the 4s counter
                    }
                    else if (face == 5)
                    {
                        ++frequency5; // increment the 5s counter
                    }
                    else if (face == 6)
                    {
                        ++frequency6; // increment the 6s counter
                    }

                }

                // output Roll Frequencies
                Console.WriteLine($"{"Face"}{"Frequency",20}"); // output headers
                Console.WriteLine("========================");
                Console.WriteLine($"1{frequency1,20}");
                Console.WriteLine($"2{frequency2,20}");
                Console.WriteLine($"3{frequency3,20}");
                Console.WriteLine($"4{frequency4,20}");
                Console.WriteLine($"5{frequency5,20}");
                Console.WriteLine($"6{frequency6,20}");

                Console.Write("\nPress y to Continue ");
                ConsoleKeyInfo Key = Console.ReadKey(); // get keypress 
                Continue = Key.KeyChar.ToString();      // convert keypress to a string character

                Console.WriteLine("\n\n");
            }

        }
    }
}
