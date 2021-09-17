import java.util.ArrayList;
import java.util.Scanner;

public class decToBin2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decNum = input.nextInt();
        int remainder;
        ArrayList<Integer> binary = new ArrayList<>();

        // devide the quotient by 2 and note store remainder as 1 or 0
        for (int i = decNum; i > 0; i /= 2) {
            remainder = (int) Math.ceil(i % 2);
            binary.add(remainder);
        }

        // display the values, backwards
        for (int c = binary.size() - 1; c >= 0; c--) {
            System.out.print(binary.get(c));
        }

        input.close();

    }
}
