
import java.util.Random;

public class combinations21 {
    public static void main(String[] args) {
        Random rn = new Random();
        int[] field = new int[11];

        field[0] = 7;
        field[8] = 6;

        // What is the value of position 1 in the array,
        // if the values of every three cosequtive numbers add up to 21?
        int i;
        int sum = 7;

        // need to use classic for loop, where i is the position and NOT the value!
        for (i = 0; i < field.length; i++) {

            if (field[i] == 0) {
                field[i] = rn.nextInt(9) + 1;
                if (i <= 1) {
                    sum = field[i] + field[i + 1] + field[i + 2];
                } else {
                    sum = field[i] + field[i - 1] + field[i - 2];
                }
            }

            System.out.print(sum + "  ");

        }

        System.out.println();

        for (int c : field)
            System.out.print(c + " ");

    }
}
