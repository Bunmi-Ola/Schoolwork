using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WpfApplication3
{
    class CustomerAccounts
    {
        public CustomerAccounts() {}

        public CustomerAccounts(int AccountNumber, string FirstName, string LastName,
                        string Email, string Phone, DateTime BalanceDate, Decimal Balance)
        {
            this.AccountNumber = AccountNumber;
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.Email = Email;
            this.Phone = Phone;
            this.BalanceDate = BalanceDate;
            this.Balance = Balance;
          
        }

        public int AccountNumber { get; set; }        
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Email { get; set; }
        public string Phone { get; set; }
        public DateTime BalanceDate { get; set; }
        public Decimal Balance { get; set; }
     

    // override tostring method - so we can display object in listbox
    public override string ToString() => $"{AccountNumber,5} {FirstName,-15} {LastName,-20} {Email,-20} {Phone,-20} {BalanceDate,-20} {Balance,-20}";

        // override Equals method so the List.Remove will work better

        // override GetHashCode ( often used with equals )


    }
}
    
