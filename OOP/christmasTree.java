
public class christmasTree {

    void tree(int height) {
        int trunkGap = height - 2;
        for (int line = 0; line <= height; line++) {
            int intend = height - line;
            for (int j = 0; j < intend; j++)
                System.out.print(" ");
            for (int hashNum = 0; hashNum < line; hashNum++)
                System.out.print("**");
            System.out.println("");

        }
        trunk(trunkGap);

    }

    private static void trunk(int intend) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= intend; j++) {
                System.out.print(" ");
            }
            System.out.println("||");

        }
    }
}
