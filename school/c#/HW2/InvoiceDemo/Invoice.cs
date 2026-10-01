using System;
using System.Collections.Generic;
using System.Text;

namespace InvoiceDemo
{
    internal class Invoice
    {
        private string itemID;
        private int quantity;
        private decimal price;
        public Invoice(string itemID, int quantity, decimal price)
        {
            this.itemID = itemID;
            this.quantity = quantity;
            Price = price;
        }

        public decimal Price 
        {
            get {  return price; }
            set
            {
                if (value >= 0)
                {
                    price = value;
                }
            }
        }

        public int GetQuantity()
        {
            return quantity;
        }
        public void SetQuantity(int quantity)
        {
            this.quantity = quantity;
        }

        public string GetItemID()
        {
            return itemID;
        }

        public decimal GetInvoiceAmount()
        {
            return price * quantity;
        }
    }
}

