
public class primes {
    public static void main(String[] args) {
        // print prime numbers

        // boolean countPrime = false;

        for (int y = 2; y <= 50; y++) {
            for (int x = 2; x <= y; x++) {

                if (y == x) {
                    System.out.print(y + "  ");
                }
                if (y % x == 0) {
                    break;

                }
            }
        }
    }
}
