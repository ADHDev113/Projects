using System;
using System.Collections.Generic;
using System.Text;

namespace FoodTruck
{
    internal class Order
    {
        OrderItem[] items;
        string name;
        public Order(OrderItem[] items, string name)
        {
            this.items = items;
            this.name = name;
        }

        public override string ToString()
        {
            return name;
        }

        public OrderItem ItemAt(int idx)
        {
            return items[idx];
        }

        public int GetItemAmount()
        {
            return items.Length;
        }
    }
}
