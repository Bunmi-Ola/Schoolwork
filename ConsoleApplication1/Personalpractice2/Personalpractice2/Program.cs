using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Personalpractice2
{
    class Program
    {
        static void Main(string[] args)
        {
            var numberOfBananas = 3;
            Console.WriteLine("Number of bananas");
            Console.WriteLine(numberOfBananas);
            numberOfBananas = 2;
            Console.WriteLine(numberOfBananas);
            var numberOfApples = 4;
            Console.WriteLine("Number of Apples");
            Console.WriteLine(numberOfApples);
            Console.WriteLine(numberOfApples + numberOfBananas);
        }
    }
}
