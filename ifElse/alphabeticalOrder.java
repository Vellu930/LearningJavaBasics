
import java.util.Scanner;

public class alphabeticalOrder {
    public static void main(String[] args) {
        Scanner typeName = new Scanner(System.in);
        System.out.println("Type in your surname: ");
        String surname = typeName.next();

        String s1 = "Panchal";
        String s2 = "Ptacek";
        String s3 = "Sleze";
        String s4 = "Zemanova";

        if (surname.compareTo(s1) < 0)
            System.out.println(surname.compareTo(s1) + " - this is your queue number. You are first in the line!");
        else if (surname.compareTo(s2) < 0)
            System.out.println(surname.compareTo(s2)
                    + " - this is your number. You are second in line. These people go before you: " + s1);
        else if (surname.compareTo(s3) < 0)
            System.out.println(surname.compareTo(s3)
                    + " - this is your number. You are third in line. These people are before you: " + s1 + " and "
                    + s2);
        else if (surname.compareTo(s4) < 0)
            System.out.println(surname.compareTo(s4)
                    + " - this is your number. You are fourth in line. These people are before you: " + s1 + ", " + s2
                    + " and " + s3);
        else if (surname.compareTo(s4) == 0)
            System.out.println(
                    surname.compareTo(s4) + " - this is your number. Aha! You are Zemanova! You go last, sorry." + s1
                            + ", " + s2 + " and " + s3 + " go before you.");
        else
            System.out.println("You are the last of all people. Maybe you should change the name..?");

        typeName.close();

    }

}
