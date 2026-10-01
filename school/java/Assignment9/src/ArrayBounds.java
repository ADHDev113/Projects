import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayBounds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++)
        {
            ints[i] = (int)(Math.random() * 100) + 1;
        }

        try
        {
            System.out.print("Enter an index: ");
            int index = input.nextInt();

            System.out.println("Value at index is: " + ints[index]);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Index out of bounds");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Incorrect data type");
        }

    }
}
