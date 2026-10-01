import java.util.Scanner;

public class KeepReal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double x = input.nextDouble();

        try
        {
            System.out.println("squareRoot(" + x + ") = " + squareRoot(x));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Invalid input: x is negative: " + x);
        }
    }

    static double squareRoot(double x) throws IllegalArgumentException
    {
        if(x < 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            return Math.sqrt(x);
        }
    }
}
