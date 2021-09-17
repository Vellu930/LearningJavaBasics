
import java.util.Arrays;

public class practiceArray {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int length = myArray.length;

        for (int i = 0; i < length; i++) {
            myArray[i] = 100 + i;
        }
        // for each item "c" in "myArray"... do the following stuff inside the brackets.
        /*
         * for (int c : myArray) { System.out.println(c); }
         */

        // Another way how to print the content of Array with inbuilt method:
        System.out.println(Arrays.toString(myArray));
    }
}
