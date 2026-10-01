import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Counting
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = input.next();
        File file = new File(fileName);

        if(file.exists())
        {
            Scanner reader = new Scanner(file);

            int characters = 0;
            int words = 0;
            int lines = 0;
            List<String> seperated;

            String temp;
            while(reader.hasNext())
            {
                temp = reader.nextLine();
                seperated = List.of(temp.split(" "));

                lines++;
                words += seperated.size();

                for (int i = 0; i < seperated.size(); i++)
                {
                    characters += seperated.get(i).length();
                }
            }

            System.out.printf("\nCharacters: %d\nWords: %d\nLines: %d", characters, words, lines);
        }
        else
        {
            throw new FileNotFoundException("File does not exist");
        }
    }
}
