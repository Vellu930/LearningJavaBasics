
public class copyArray {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        // Array1 value assigned:
        for (int i = 0; i < array1.length; i++) {
            // using static method from other class "basicArrays"
            array1[i] = basicArrays.getRandomNumInRange(10, 99);
            // Array2 values assigned through indexes from Array1:
            array2[i] = array1[i];
        }
        array1[9] = -7;

        System.out.print("Array 1: ");
        for (int b : array1) {
            System.out.print(b + "  ");
        }

        System.out.println();
        System.out.print("Array 2: ");
        for (int c : array2) {
            System.out.print(c + "  ");
        }
    }
}
