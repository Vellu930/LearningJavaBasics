import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class decToHex {
    public static void main(String[] args) {

        System.out.println("Type a decimal number:  ");
        Scanner input = new Scanner(System.in);
        int dec = input.nextInt();
        input.close();
        int num1 = 1; // num1 is the result of divison
        int remainder;
        ArrayList<String> hexaNum2 = new ArrayList<String>();
        ArrayList<Integer> rem = new ArrayList<Integer>();
        HashMap<Integer, String> hexaBase = new HashMap<Integer, String>();
        hexaBase.put(10, "A");
        hexaBase.put(11, "B");
        hexaBase.put(12, "C");
        hexaBase.put(13, "D");
        hexaBase.put(14, "E");
        hexaBase.put(15, "F");

        while (num1 != 0) {
            num1 = dec / 16;
            remainder = (int) dec % 16;
            dec = num1;
            rem.add(remainder);

        }
        for (int r : rem) {
            if (r > 9) {
                hexaNum2.add(hexaBase.get(r));
            } else {
                hexaNum2.add(Integer.toString(r));
            }
        }

        for (int i = hexaNum2.size() - 1; i >= 0; i--) {
            System.out.print(hexaNum2.get(i));
        }
    }
}
