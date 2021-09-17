
import java.util.Scanner;

public class orderLinearSearch {
    public static void main(String[] args) {
        int[] orderNumbers = { 23435, 87309, 67098, 12345, 23456, 12345 };
        int count = 0;
        Scanner type = new Scanner(System.in);

        int howManyOrders = orderNumbers.length;
        System.out.println("We have total of " + howManyOrders + " orders!");

        System.out.println("Type the 5-digit order number: ");
        int findOrder = type.nextInt();
        boolean flag = false;

        for (int n : orderNumbers) {
            if (n == findOrder) {
                System.out.println("Here is your order n.:   " + n);
                count++;
                flag = true;
            }
        }
        System.out.println("We have " + count + " order/s with number " + findOrder);
        if (flag == false) {
            System.out.println("no order under this number. ");
        }

        type.close();

    }
}
