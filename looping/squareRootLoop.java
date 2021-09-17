
import java.util.Scanner;

public class squareRootLoop {
    public static void main(String[] args) {
        System.out.println("Square Roots!");
        Scanner typeNum = new Scanner(System.in);
        System.out.println("Type a number to get square root: ");
        int number = typeNum.nextInt();

        while (number < 0) {
            System.out.println("You can't take the square root of a negative number, silly! \nTry again: ");
            number = typeNum.nextInt();
        }
        double root = Math.sqrt(number);
        System.out.println("The suqare root is:   " + root);

        typeNum.close();
    }
}
