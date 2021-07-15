using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Comp255FinalProject
{
    class InvoiceItem
    {
        public InvoiceItem() { }

        public InvoiceItem(int ItemID, int InvoiceID, string ItemName,
                          string ItemDescription, Decimal ItemPrice, int ItemQuantity)
        {
            this.ItemID = ItemID;
            this.InvoiceID = InvoiceID;
            this.ItemName = ItemName;
            this.ItemDescription = ItemDescription;
            this.ItemPrice = ItemPrice;
            this.ItemQuantity = ItemQuantity;           
        }
        public int ItemID { get; set; }
        public int InvoiceID { get; set; }
        public string ItemName { get; set; }
        public string ItemDescription { get; set; }
        public Decimal ItemPrice { get; set; }
        public int ItemQuantity { get; set; }

        public Decimal Price
        {
            get
            {
                //Build or calculate the property on request 
                return ItemPrice * ItemQuantity;
            }
        }
        public Decimal Subtotal
        {
            get
            {
                decimal Subtotal = 0;
                //Build or calculate the property on request 
                return Subtotal +=Price;
            }
        }
        public decimal PST
        {
            get
            {
                //Build or calculate the property on request 
                decimal PSTrate = 5.52m;
                return (PSTrate / 100) * Subtotal;
            }
        }
        public decimal GST
        {
            get
            {
                //Build or calculate the property on request
                decimal GSTrate = 4.9m;
                return (GSTrate / 100) * Subtotal;
            }
        }   
        public decimal TotalPrice
        {
            get
            {
                //Build or calculate the property on request 
                return Subtotal+GST+PST;
            }
        }
        // override tostring method - so we can display object in listbox
        public override string ToString() => $"{ItemID,3} {ItemName,-5} {ItemDescription,-5} {ItemPrice,-5}{ItemDescription,-5}{Price,-5}";

        // override Equals method so the List.Remove will work better

        // override GetHashCode ( often used with equals )


    }
}