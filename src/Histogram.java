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
        // creating alphabet array to print each letter on each line
        double numStars = 0;
        char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.println("Histogram:");
        //for loop iterates through alphabet and prints, iterates through
        // data array, divides current number in data array by the max,
        // max is casted as a double because integer division makes a fraction and prints zero stars
        // multiplied by 100 to get out of fraction
        //if elses determine how many spaces to line up stars correctly
        // second for loop prints a star for every current numStars
        // last if statement checks when to create a new line
            for (int i = 97; i < 123; i++) {
                System.out.print(alphabet[i - 97] + " ");
                numStars = data[i] / ((double) (findmax())) * 100;
                if (data[i] < 1000) {
                    System.out.print(data[i] + "      ");
                } else if (data[i] < 10000) {
                    System.out.print(data[i] + "     ");
                } else if (data[i] < 100000) {
                    System.out.print(data[i] + "    ");
                } else {
                    System.out.print(data[i] + "   ");
                }
                for (int j = 0; j < numStars; j++) {

                    System.out.print("*");
                    if (j == (int) numStars | j == 99) {
                        System.out.println();
                    }
                }

        }

    }
}
