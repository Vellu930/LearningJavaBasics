
public class exerciseHash {
    public static void Main(String[] args) {
        int i = 5;
        for (int line = 0; line < 5; line++) {
            for (int hashNum = 0; hashNum < i; hashNum++)
                System.out.print("#");
            System.out.println("");
            i--;
        }

    }
}
