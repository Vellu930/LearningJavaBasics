
import java.util.Scanner;

public class decryptMyInt {
    public static void main(String[] args) {
        Scanner typeCode = new Scanner(System.in);
        System.out.println("Enter your code: ");
        String code = typeCode.nextLine();
        String[] charArrayStrings = code.split("-");
        System.out.println(charArrayStrings.toString());

        typeCode.close();
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
