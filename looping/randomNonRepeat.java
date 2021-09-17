
import java.util.Random;

public class randomNonRepeat {
    public static void main(String[] args) {
        Random rand = new Random();

        int first = 0;
        int second;

        for (int i = 0; i < 10; i++) {
            second = rand.nextInt(2);
            while (first == second) {
                second = rand.nextInt(2);
            }
            System.out.println("      Second: " + second);
            first = second;

        }
    }
}
