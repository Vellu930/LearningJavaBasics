public class sidewaysTriangle {
    public static void main(String[] args) {

        int max = 5;
        int row = max - 1;

        for (int x = row * (-1); x <= row; x++) {
            for (int y = 1; y <= max - Math.abs(x); y++) {
                System.out.print("#");
            }
            System.out.print("  ");
            for (int y = 1; y <= max - Math.abs(x); y++) {
                System.out.print("#");
            }

            System.out.println();
        }

    }
}
