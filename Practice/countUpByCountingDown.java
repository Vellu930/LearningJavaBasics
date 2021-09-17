
public class countUpByCountingDown {
    public static void main(String[] args) {

        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int d = 1; d <= num - i; d++)
                System.out.print("#");

            System.out.println();
        }

    }
}
