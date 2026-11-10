using System;
using System.Collections.Generic;
using System.Text;

namespace FoodTruck
{
    internal class OrderItem
    {
        string foodName;
        int quantity;
        public OrderItem(string foodName, int quantity)
        {
            this.foodName = foodName;
            this.quantity = quantity;
        }
        public override string ToString() => $"{foodName}({quantity})";
    }
}
