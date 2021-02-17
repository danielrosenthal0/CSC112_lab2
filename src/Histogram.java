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
        double numStars = 0;
        //System.out.println((double)(10000/(double)(findmax())));
        for (int i = 0; i < data.length; i++) {
            numStars = data[i] / ((double)(findmax())) * 100;
            //System.out.println(numStars);
            for (int j = 0; j < numStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //System.out.println(findmax());
    }
}
