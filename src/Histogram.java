import java.sql.SQLOutput;

/**
 * Create a Histogram object based on an integer array.
 */

public class Histogram {

    private int[] data;  // data to be graphed
    private final int PAGEWIDTH = 100;  // maximum row size

    // constructor
    public Histogram(int[] data){
        this.data = data;
    }

    // need to know largest int value for scaling row size
    private int findmax(){
        int max = data[0];
        //complete this
        // for loop checks current number in data array, compares to max, replaces if greater
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    // print the histogram
    public void print(){
        //complete this
        //initializing the number of stars i will need to print
        double numStars = 0;
        //for loop iterates through data array, divides current number in data array by the max,
        // max is casted as a double because integer division makes a fraction and prints zero stars
        // multiplied by 100 to get out of fraction
        // second for loop prints a star for every current numStars
        for (int i = 0; i < data.length; i++) {
            numStars = data[i] / ((double)(findmax())) * 100;
            for (int j = 0; j < numStars; j++) {
                System.out.print("*");
                if (j == (int) numStars) {
                    System.out.println();
                }
            }
        }

    }
}
