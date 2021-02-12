import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.io.*;

/**
 * Reads a text file containing ASCII characters.
 * Counts letters.
 * Prints a histogram of letter frequencies.-
 */
public class Main {

    // Choose a text file located in .src folder
    private final String FILENAME = "MobyDick";

    // open file and construct a scanner
    private Scanner openInputFile(){
            //complete this method
        FileInputStream myFile = null;
        try {
            myFile = new FileInputStream("src/MobyDick.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File is not found.");
            System.exit(1);
        }
        Scanner fileReader = new Scanner(myFile);

            return fileReader;
    }

    // iterate through a single line to count letters
    private void processLine(String line, int[] letterCounts){
        //complete this method
        line = line.toLowerCase();
        int length = line.length();
        //int ascii = 0;
        //char character = 'a';

        for (int i = 0; i < length; i++) {
            char character = line.charAt(i);
            //int ascii = character;
            //System.out.println("Hi" + character);
            if (Character.isLetter(character)) {
                letterCounts[character]++;
            }

            //System.out.print(letterCounts);
            //if (ascii >= 97 | ascii <= 122) {
                //System.out.print(ascii);
                //letterCounts[ascii]++;
                 //System.out.print(letterCounts);
            //}
            }

        //processLine(line);
        //fileReader.close();

    }

    // read each line of file and pass to processLine to count characters
    private int[] processFile(Scanner fileReader){
        int letterCounts[] = new int[128];
        while (fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            if (!line.isEmpty()) {
                processLine(line, letterCounts);
            }

        }
        for (int i = 97; i < 128; i++) {
            System.out.println(letterCounts[i]);
        }
        //complete this method
        return letterCounts;
    }

    // main switchboard
    public void run(){
        Scanner fileReader = openInputFile();
        int[] results = processFile(fileReader);
        Histogram h=new Histogram(results);
        h.print();
    }

    public static void main(String[] args) {

        new Main().run();
    }
}
