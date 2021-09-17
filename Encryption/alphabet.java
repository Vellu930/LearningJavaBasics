
public class alphabet {
    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            int x = Character.getNumericValue(i);
            System.out.print(x + " - ");
            System.out.print(" " + String.valueOf(i));
            System.out.print(i + ";  ");

        }
    }
}
