import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CleanFiles
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file to clean: ");
        String file1Name = input.next();
        System.out.print("Enter file to save to: ");
        String file2Name = input.next();

        File readFile = new File(file1Name);
        File writeFile = new File(file2Name);

        if(readFile.exists())
        {
            Scanner reader = new Scanner(readFile);
            PrintWriter writer = new PrintWriter(writeFile);

            String temp;
            while (reader.hasNext())
            {
                temp = reader.nextLine();
                temp = temp.replaceAll("help", "****");
                temp = temp.replaceAll("dime", "****");
                temp = temp.replaceAll("ask", "***");
                temp = temp.replaceAll("beach", "*****");
                temp = temp.replaceAll("ship", "****");
                temp = temp.replaceAll("fish", "****");

                writer.println(temp);
            }
            System.out.println("\nDone cleaning!");

            reader.close();
            writer.close();
        }
        else
        {
            throw new  FileNotFoundException("File does not exist");
        }
    }
}
