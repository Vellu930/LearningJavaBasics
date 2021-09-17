import java.util.ArrayList;
import java.util.Scanner;

public class decToBin1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type deciaml number:");
        int dec = input.nextInt();
        input.close();
        int max = 0;
        int n = dec;
        int sum = 0;
        ArrayList<Integer> baseNumbers = new ArrayList<>();
        ArrayList<Character> binary = new ArrayList<>();

        while (sum != dec) {
            // find the highest number lower than dec:
            for (int i = 1; i <= n; i += i) {
                max = i;
            }
            n = n - max;
            sum = sum + max;
            /*
             * System.out.print(sum + ", "); System.out.println(max + ", ");
             */

            // loop through the base numbers again
            // check which number i is equal to max
            // this number will become '1'
            // Store the max values in baseNumbers
            for (int i = 1; i <= dec; i += i) {
                if (i == max) {
                    baseNumbers.add(i);
                }
            }
        }

        // Compare the values from ArrayList baseNum with the actual base numbers

        for (int i = 1; i <= dec; i += i) {
            if (baseNumbers.contains(i)) {
                binary.add('1');
            } else {
                binary.add('0');
            }
        }

        // show the values from binary ArrayList, backwards
        for (int c = binary.size() - 1; c >= 0; c--) {
            System.out.print(binary.get(c));
        }

    }
}
