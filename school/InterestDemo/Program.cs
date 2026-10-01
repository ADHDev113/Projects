namespace InterestDemo;

class Program
{
    static void Main(string[] args)
    {
        decimal principle = 1000;
        decimal interestRate = 0.05m;
        decimal amount;

        Console.WriteLine("Year\tAmount On Deposit");
        // for (int i = 1; i <= 10; i++)
        // {
        //     amount += amount * interestRate;
        //     Console.WriteLine($"{i,4}\t{amount,17:C}");
        // }
        for (int i = 1; i <= 10; i++)
        {
            amount = principle * (decimal)Math.Pow(1 + (double)interestRate, i);
            Console.WriteLine($"{i,4}\t{amount,17:C}");
        }
    }
}