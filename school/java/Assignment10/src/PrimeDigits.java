import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimeDigits
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = input.next();
        System.out.println();
        File file = new File(fileName);

        if(file.exists())
        {
            Scanner reader = new Scanner(file);

            String temp;
            int digit;
            int[] digits = new int[10];
            int total = 0;

            while(reader.hasNext())
            {
                temp = reader.nextLine();

                for (int i = 0; i < temp.length(); i++)
                {
                    digit = temp.charAt(i) - '0';
                    digits[digit]++;
                    total++;
                }
            }

            for (int i = 0; i < 10; i++)
            {
                System.out.printf("%ds: %d\n", i, digits[i]);
            }

            System.out.println("\nTotal: " + total);

            reader.close();
        }
        else
        {
            throw new FileNotFoundException("File does not exist");
        }

    }
}
