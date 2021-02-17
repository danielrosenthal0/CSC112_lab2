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
    private final String FILENAME = "Alice";

    // open file and construct a scanner
    private Scanner openInputFile(){
            //complete this method
        FileInputStream myFile = null;
        // try and catch for file not found exception
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
        // converts current line to lowercase
        line = line.toLowerCase();

        // assigns length of line to length
        int length = line.length();

        // iterates through each letter of current line, checks if it is a letter then updates the correct
        //location in the array
        for (int i = 0; i < length; i++) {
            char character = line.charAt(i);
            if (Character.isLetter(character)) {
                letterCounts[character]++;
            }
            }
    }

    // read each line of file and pass to processLine to count characters
    private int[] processFile(Scanner fileReader){
        //complete this method
        int letterCounts[] = new int[128];

        // while loop goes through file, checking if line has text or is empty
        // if line has text, passes line and letterCounts to processLine method
        while (fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            if (!line.isEmpty()) {
                processLine(line, letterCounts);
            }
        }
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
