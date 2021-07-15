using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LAB1
{
    class Program
    {
        static void Main(string[] args)
        {

            string Name;
            int studentNumber;
            string Email;


            Console.WriteLine("Your contact data is: ");
            //Enter a name
            Console.Write("Name : ");
            Name = Console.ReadLine();

            //Enter student number
            Console.Write("Student Number : ");
            studentNumber = int.Parse(Console.ReadLine());

            //Enter Email
            Console.Write("Email: ");
            Email = Console.ReadLine();

            Console.WriteLine($"\nYour contact data is: \n Name: {Name} \n student number: {studentNumber:D6} \n Email {Email}");

            Console.ReadLine();

        }
    }
}
