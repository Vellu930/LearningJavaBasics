
public class accessing2DArray {
    public static void main(String[] args) {

        String[][] myArray = { { "value - 1", "value - 2" }, { "value - 3", "value - 4" },
                { "value - 5", "value - 6" } };

        for (String[] row : myArray) {
            for (String col : row) {
                System.out.println(col);
            }

            System.out.println();
        }
    }
}
