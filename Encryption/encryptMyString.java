
import java.util.Scanner;

public class encryptMyString {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.println("Type your message now: ");
        String message = type.nextLine();
        char[] characters = message.toCharArray();

        for (char ch : characters) {
            int numValue = Character.getNumericValue(ch);
            System.out.print(numValue);

        }
        type.close();
    }
}
