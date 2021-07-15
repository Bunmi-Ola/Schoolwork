using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class CustomerAccount
    {
        private string Firstname;
        private string Lastname;
        private int Accountnumber;
        private double Balance;

        public CustomerAccount(string Firstname, string Lastname, int Accountnumber, double Balance)
        {
            this.Firstname = Firstname;
            this.Lastname = Lastname;
            this.Accountnumber = Accountnumber;
            this.Balance = Balance;
        }

        public string FirstName
        {
        get { return Firstname; }
        set { Firstname = value; }
        }
        public string LastName
        {
            get { return Lastname; }
            set { Lastname = value; }
        }
        public int AccountNumber
        {
            get { return Accountnumber; }
            set { Accountnumber = value; }
        }
        public double balance
        {
            get { return Balance; }
            set { Balance = value; }
        }
        
    }
}
