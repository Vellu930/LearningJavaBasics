import java.io.FileReader;
import java.io.IOException;

public class nameReader {
    public static void main(String[] args) {
        reader();
    }

    private static void reader() {
        int n = 0;
        try {
            FileReader read = new FileReader("numbers.txt");
            int data = read.read();
            while (data != -1) {
                n = (char) data + n;
                System.out.println("This is the sum of your numbers: " + n);
            }
            read.close();

            System.out.println("This is the sum of your numbers: " + n);

        } catch (IOException e) {
            System.out.println("Bad error bro... IO exception");
            e.printStackTrace();
        }
    }
}
