public class star {
    public static void main(String[] args) {

        int max = 7;
        int gap = (max + (max - 2));
        int row = max - 1;

        for (int x = row * (-1); x <= row; x++) {
            for (int y = 1; y <= max - Math.abs(x); y++) {
                System.out.print(" ");
            }

            for (int y = 1; y <= max - Math.abs(x); y++) {
                System.out.print("*");
            }
            for (int y = 0; y <= Math.abs(gap) - 1; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y <= Math.abs(gap) - 1; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y <= max - Math.abs(x); y++) {
                System.out.print("*");
            }

            gap -= 2;
            System.out.println();
        }

    }
}
