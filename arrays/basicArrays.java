
import java.util.Random;

public class basicArrays {

    public static int getRandomNumInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        int[] myArray = new int[1000];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = getRandomNumInRange(10, 99);

        }

        for (int c : myArray) {
            System.out.print(c + "  ");
        }

    }
}
