namespace InvoiceDemo
{
    internal class InvoiceTest
    {
        static void Main(string[] args)
        {
            Invoice i1 = new Invoice("Item50023", 4, 19.99m);
            Console.WriteLine($"Invoice(item ID: {i1.GetItemID()}, quantity:{i1.GetQuantity()}, price per item:{i1.Price:C})\nThe total is {i1.GetInvoiceAmount():C}");
            i1.Price = 15.99m;
            Console.WriteLine($"Invoice(item ID: {i1.GetItemID()}, quantity:{i1.GetQuantity()}, price per item:{i1.Price:C})\nThe total is {i1.GetInvoiceAmount():C}");

        }
    }
}
