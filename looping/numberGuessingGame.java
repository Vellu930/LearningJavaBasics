
import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int secretNumber = r.nextInt(10);
        int guessNum;

        do {
            System.out.println("Guessa number from 1 to 10");
            guessNum = sc.nextInt();
            if (guessNum == secretNumber)
                System.out.println("You got my secret number! You are COOOOOOL!");
            else
                System.out.println("Wrong number. Try again!");

        } while (guessNum != secretNumber);

        sc.close();
    }
}
