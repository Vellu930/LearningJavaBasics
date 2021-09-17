package arrays;

import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args) {
        int[] orderNumbers = { 2, 8309, 670098, 1234, 234, 12, 34, 3 };
        // Arrays.sort(orderNumbers); <--this is how normal people sort numbers

        System.out.println("Unsorted array: " + Arrays.toString(orderNumbers));

        // Manual sorting by swapping numbers <-- this is learning example for idiots to
        // understand how it works maybe?
        int value1;
        // first loop iterates through the values and stores the first value to compare
        for (int c = 0; c < orderNumbers.length; c++) {

            for (int d = 0; d < orderNumbers.length; d++) {
                // From smallest to largest, to switch order just change the < sign
                if (orderNumbers[d] > orderNumbers[c]) { // At first I mistakenly assigned both values
                    value1 = orderNumbers[d]; // but I only need one value to store as temporary
                    orderNumbers[d] = orderNumbers[c]; // switch the first value
                    orderNumbers[c] = value1; // and then assign the stored value to our previous position

                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(orderNumbers));

    }
}
