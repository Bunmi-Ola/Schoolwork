using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Arrays
{
    class Program
    {
        static void Main(string[] args)
        {
            creadtGrid();
            Console.ReadKey();
        }

        public static void creadtGrid()
        {
            int width = 5;
            int lenght = 5;

            int[,] grid = new int[width, lenght];
            // doing array of array int [][] grid = new int [width] [lenght];
            for (int x = 0; x < width; x++)
            {
                for (int Y = 0; Y < lenght; Y++)
                {
                    grid[x, Y] = x + Y;
                    Console.Write(grid[x, Y] + " ");
                }
                Console.WriteLine();
            }
        }
    }
}
