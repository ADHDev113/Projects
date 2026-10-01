using System.IO.IsolatedStorage;

namespace DigitsOfAnInteger
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter an integer number with five digits: ");
            int num = int.Parse(Console.ReadLine());
            int[] nums = new int[5];

            int d1 = num / 10000 % 10;
            int d2 = num / 1000 % 10;
            int d3 = num / 100 % 10;
            int d4 = num / 10 % 10;
            int d5 = num % 10;

            Console.WriteLine($"{d1}\t{d2}\t{d3}\t{d4}\t{d5}");
        }
    }
}
