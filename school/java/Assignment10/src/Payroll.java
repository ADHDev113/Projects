import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Payroll
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = input.next();
        System.out.println();
        File file = new File(fileName);

        if(file.exists())
        {
            try
            {
                Scanner reader = new Scanner(file);

                String firstName;
                String lastName;
                double salary;
                double totalSalary = 0;
                int employees = 0;

                while (reader.hasNext())
                {
                    employees++;
                    firstName = reader.next();
                    lastName = reader.next();
                    salary = reader.nextDouble();
                    totalSalary += salary;

                    System.out.printf("%s %s %f\n", firstName, lastName, salary);
                }
                double averageSalary = totalSalary / employees;

                System.out.printf("\nAverage: $%.2f", averageSalary);
            }
            catch (Exception e)
            {
                throw new RuntimeException("Invalid Formatting");
            }
        }
        else
        {
            throw new FileNotFoundException("File does not exist");
        }
    }
}
