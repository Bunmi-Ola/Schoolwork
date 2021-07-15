using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lap7
{
    class customerAccounts
    {
        private string _Firstname;
        private string _Lastname;
        private int _Accountnumber;
        private double _Balance;

        public customerAccounts(string firstname, string lastname, int accountnumber, double Balance)
        {
            FirstName = firstname;
            LastName = lastname;
            AccountNumber = accountnumber;
            balance = Balance;
        }

        public string FirstName
        {
            get { return _Firstname; }
            set { _Firstname = value; }
        }
        public string LastName
        {
            get { return _Lastname; }
            set { _Lastname = value; }
        }
        public int AccountNumber
        {
            get { return _Accountnumber; }
            set { _Accountnumber = value; }
        }
        public double balance
        {
            get { return _Balance; }
            set { _Balance = value; }
        }

        // Usual way to make a method that returns a result
        
        public override string ToString() => $"{FirstName} {LastName} {AccountNumber} {balance}";
    }
}