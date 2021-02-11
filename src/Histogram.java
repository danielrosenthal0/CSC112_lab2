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
        return max;
    }

    // print the histogram
    public void print(){
        //complete this
    }
}
