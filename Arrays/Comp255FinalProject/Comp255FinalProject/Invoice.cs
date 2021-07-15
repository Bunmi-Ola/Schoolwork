using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Comp255FinalProject
{
    class Invoice
    {
        public Invoice() { }

    public Invoice(int InvoiceID, DateTime InvoiceDate,
                    bool Shipped, string CustomerName,
                    string CustomerAddress,
                    string CustomerEmail)
    {
        this.InvoiceID = InvoiceID;
        this.InvoiceDate = InvoiceDate;
        this.Shipped = Shipped;
        this.CustomerName = CustomerName;
        this.CustomerAddress = CustomerAddress;
        this.CustomerEmail = CustomerEmail;
    }

    public int InvoiceID { get; set; }
    public DateTime InvoiceDate { get; set; }
    public bool Shipped { get; set; }
    public string CustomerName { get; set; }
    public string CustomerAddress { get; set; }
    public string CustomerEmail { get; set; }
   

        // override tostring method - so we can display object in listbox
        public override string ToString() => $"{InvoiceID,8} {InvoiceDate,-25}{CustomerName,-15}{CustomerAddress,-15} {CustomerEmail,-15} {Shipped,-20}";

    // override Equals method so the List.Remove will work better

    // override GetHashCode ( often used with equals )
    }
}