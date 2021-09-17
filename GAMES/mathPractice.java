
import java.util.Random;
import java.util.Scanner;

public class mathPractice {
    public static void main(String[] args) {
        // Ask which operation to perform:
        System.out.println("Which operation to practice? ");
        System.out.println(" 1 for + , 2 for - , 3 for * , 4 for / ");
        Scanner sc = new Scanner(System.in);
        int operand = sc.nextInt();
        String sign = " ";
        int sum = 0;
        String rightWrong = "correct"; // I think this is flag!
        int countCorrectAnswers = 0;

        while (rightWrong.equals("correct")) {
            // generate random numbers to calculate with:
            Random ranNumbers = new Random();
            int x = ranNumbers.nextInt(100);
            int y = ranNumbers.nextInt(50);

            switch (operand) {
                case 1:
                    sum = x + y;
                    sign = "+";
                    break;
                case 2:
                    sum = x - y;
                    sign = "-";
                    break;
                case 3:
                    sum = x * y;
                    sign = "*";
                    break;
                case 4:
                    sum = x / y;
                    sign = "/";
                    break;

            }

            // Ask how much is 'x' +/-/*// 'y' from the user input and store his guess in
            // variable
            System.out.println("How much is " + x + sign + y);
            int mySum = sc.nextInt();

            if (mySum == sum) {
                System.out.print("Correct!   ");
                countCorrectAnswers++;
            } else {
                System.out.println("Wrong!");
                rightWrong = "Wrong";
            }
        }
        System.out.println("Game over! You have " + countCorrectAnswers + " correct answers!");
        sc.close();
    }

}
