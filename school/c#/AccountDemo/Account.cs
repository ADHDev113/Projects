using System;
using System.Collections.Generic;
using System.Security.Cryptography.X509Certificates;
using System.Text;

namespace AccountDemo
{
    internal class Account
    {
        //private string name;
        //private decimal balance;
        private decimal balance;

        public Account(string name, decimal initialBalance)
        {
            Name = name;
            Balance = initialBalance;
        }

        //public void SetName(string name)
        //{
        //    this.name = name;
        //}

        //public string GetName()
        //{
        //    return name;
        //}
        public string Name { get; set; } // auto-implemented Property.

        //public decimal GetBalance()
        //{
        //    return balance;
        //}

        //public void SetBalance(decimal balance)
        //{
        //    this.balance = balance;
        //}

        public decimal Balance 
        {
            get
            {
                return balance;
            }
            set
            {
                if (value >= 0)
                {
                    balance = value;
                }
            }
        }

        public void deposit(decimal amount)
        {
            Balance += amount;
        }

        public void withdraw(decimal amount)
        {
            Balance -= amount;
        }
    }
}
