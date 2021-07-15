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
            CustomerAccount[] customerArray = new CustomerAccount[3];
            customerArray[0] = new CustomerAccount("Robin", "Jo", 12345, 50);
            customerArray[1] = new CustomerAccount("Kelly", "Jaimie", 45678, 100);
            customerArray[2] = new CustomerAccount("Pat", "Green", 78945, 70);

            for (int i = 0; i < customerArray.Length; i++)
            {
                Console.WriteLine("{0}, {1} {2}, {3}", customerArray[i].FirstName, customerArray[i].LastName, customerArray[i].AccountNumber, customerArray[i].balance);
            }
            Console.ReadLine();
        }
    }
}
