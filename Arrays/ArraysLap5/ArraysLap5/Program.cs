using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArraysLap5
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] Months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            int[] value = { 10, 15, 25, 5, 3, 30, 11, 8, 12, 35, 20, 7 };

            Console.WriteLine($"{"Labels"}{"Values",10}");
            ShowGraph(Months, value);

            Console.ReadKey();
        }

        static void ShowGraph(String[] Labels, int[] Values)

        {

            for (int i = 0; i < Values.Length; i++)
            {
                Console.WriteLine();
                Console.Write($"{Labels[i]}{Values[i],10}");
                
                for (int j = 0; j < Values[i]; ++j)
                {
                    Console.Write($"{"*", 1}");
                }
               
            }

        }

    }
}
