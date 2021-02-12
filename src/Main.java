import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        int length = line.length();
        int ascii = 0;
        char character = 'a';
        //ascii = (int) character;
        for (int i = 0; i < length; i++) {
            character = line.charAt(i);
            //System.out.print(character);

            if (ascii >= 97 | ascii <= 122) {
                //System.out.print(ascii);
                //letterCounts[ascii]++;
                 //System.out.print(letterCounts);
            }}
        //processLine(line);
        //fileReader.close();

    }

    // read each line of file and pass to processLine to count characters
    private int[] processFile(Scanner fileReader){
        int letterCounts[] = new int[128];
        while (fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            if (line.isEmpty()) {

            } else {
                processLine(line, letterCounts);
            }

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
