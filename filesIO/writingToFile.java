import java.io.FileWriter;
import java.io.IOException;

public class writingToFile {
    public static void main(String[] args) {
        // File f = new File("test.txt"); //created new file
        String myText = "";
        for (int i = 0; i < 5; i++) {
            myText = "Here comes beer n. " + (i + 1) + "\n";
            myWriter(myText);
        }
    }

    public static void myWriter(String myText) {
        try {
            FileWriter writer = new FileWriter("test.txt", true);
            writer.write(myText);
            writer.close();
            System.out.println("Success! Wrote you a note.");
        } catch (IOException e) {
            System.out.println("Error occured.");
            e.printStackTrace();
        }
    }
}
