import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumberMaker
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = input.nextInt();
        System.out.print("Enter stop: ");
        int stop = input.nextInt();
        System.out.print("Enter step: ");
        int step = input.nextInt();

        System.out.print("Enter file: ");
        String fileName = input.next();

        File file = new File(fileName);
        PrintWriter writer = new PrintWriter(file);

        int j = 0;
        for (int i = start; i <= stop; i+= step)
        {
            writer.print(i + " ");
            j++;
            if(j % 10 == 0)
            {
                writer.println();
            }
        }
        System.out.println("\nWriting Complete!");

        writer.close();
    }
}
