
import java.util.Arrays;

public class sumArray {
    public static void main(String[] args) {
        char[] myArray = new char[25];
        int howLongAreYou = myArray.length;
        int sum = 0;

        for (int i = 0; i < howLongAreYou; i++) {
            myArray[i] = (char) ('a' + i);
        }
        System.out.println(Arrays.toString(myArray));
        for (int q = 0; q < howLongAreYou; q++) {
            sum = sum + myArray[q];

        }
        System.out.println(sum);
    }
}
