import java.util.Scanner;

public class binToDec {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String bin = input.nextLine();
        input.close();

        char[] c = bin.toCharArray();
        int l = c.length;
        int sum = 0;
        for (int i = 0; i < l; i++) {
            if (c[i] == '1') {
                int n = l - i - 1;
                sum = (int) (1 * Math.pow(2, n)) + sum;
            }
        }
        System.out.println(sum);
    }
}