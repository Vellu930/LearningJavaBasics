import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readingMyFile {

    public static void main(String[] args) throws IOException {

        // myFileReader();
        myBuffReader("test.txt");
    }

    private static void myBuffReader(String filename) {
        try {
            FileReader read = new FileReader(filename);
            BufferedReader buffReader = new BufferedReader(read);
            String line = "";
            while ((line = buffReader.readLine()) != null) {
                System.out.print(line + ",  ");
            }
            buffReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
     * private static void myFileReader() { try { FileReader read = new
     * FileReader(filename); int data; while ((data = read.read()) != -1)
     * System.out.print((char) data);
     * 
     * read.close();
     * 
     * } catch (IOException e) { e.printStackTrace(); } }
     */
}
