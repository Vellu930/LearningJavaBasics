
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        for (int i = 2; i <= 100; i++) {
            for (int x = 2; x <= i; x++) {
                if (x == i) {
                    primeNumbers.add(i);
                }
                if (i % x == 0) {
                    break;
                }
            }

        }
        for (int c = 0; c < primeNumbers.size(); c++) {

            System.out.print(primeNumbers.get(c) + "  ");
        }

        /*
         * primeNumbers.add("Carrot Cake"); primeNumbers.add("South Indian Thali");
         * primeNumbers.add("Masala Dosa"); primeNumbers.add("Idly Vada Sambar");
         * System.out.println(primeNumbers.indexOf("Masala Dosa"));
         */
    }

}
