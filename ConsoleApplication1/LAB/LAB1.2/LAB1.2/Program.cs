using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LAB1._2
{
    class Program
    {
        static void Main(string[] args)
        {

            // Declare floating variables
            double Number1;
            double Number2;
            double Number3;
            double Total;
            double Product;

            Console.Write("Please enter number 1 :");
            Number1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Please enter number 2 :");
            Number2 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Please enter number 3 :");
            Number3 = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("The results are:");
            Total = Number1 + Number2 + Number3;
            Console.WriteLine("\n{0:N2} + {1:N2} + {2:N2} = {3:N2}", Number1, Number2, Number3, Total);

            Product = Number1 * Number2 * Number3;
            Console.WriteLine("\n{0:N2} X {1:N2} X {2:N2} = {3:N2}", Number1, Number2, Number3, Product);

            Console.ReadKey();

        }
    }
}
