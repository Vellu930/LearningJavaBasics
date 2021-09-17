
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int result = 0;
        sc.close();
        System.out.println("The factors are: ");
        for (int i = 1; i <= number; i++) {
            result = number % i;
            if (result == 0) {
                System.out.print(number / i + ", ");
            }
        }

    }
}
