import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Reads a text file containing ASCII characters.
 * Counts letters.
 * Prints a histogram of letter frequencies.-
 */
public class Main {

    // Choose a text file lcated in .src folder
    private final String FILENAME = "MobyDick";

    // open file and construct a scanner
    private Scanner openInputFile(){
            //complete this method
            return null;
    }

    // iterate through a single line to count letters
    private void processLine(String line, int[] letterCounts){
        //complete this method
    }

    // read each line of file and pass to processLine to count characters
    private int[] processFile(Scanner fileReader){
        int letterCounts[] = new int[128];
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
