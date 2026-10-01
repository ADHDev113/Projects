namespace AccountDemo
{
    internal class AccountTest
    {
        static void Main(string[] args)
        {
            Account myAccount = new Account("Tom Cruise", 1000m);
            Console.WriteLine($"Initial name is: {myAccount.Name}");
            Console.WriteLine($"Initial balance is: {myAccount.Balance}");

            Console.Write("Enter the name: ");
            string name = Console.ReadLine();
            //myAccount.SetName(name);
            myAccount.Name = name.Trim();

            Console.Write("Enter the new balance: ");
            decimal amount = decimal.Parse(Console.ReadLine());
            myAccount.Balance = amount;

            //Console.WriteLine($"myAccount's name is {myAccount.GetName()}");
            //Console.WriteLine($"myAccount's balance is {myAccount.GetBalance()}");

            Console.WriteLine($"Account({myAccount.Name}, {myAccount.Balance:C})");
            Console.Read();
        }
    }
}
