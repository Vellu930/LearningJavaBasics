import java.sql.Date;
import java.util.Locale;

public class printF {
    public static void main(String[] args) {
        // line seprator
        System.out.printf("baeldung %nline %n terminator %n");

        // boolean formatting
        System.out.printf("%b %n", false);
        System.out.printf("%B %n", false);
        System.out.printf("%B %n", 5.3);
        System.out.printf("%b %n", "random text");

        // String to uppercase
        System.out.printf("'%s' %n", "baeldung");
        System.out.printf("'%S' %n", "baeldung");

        // specify character length
        System.out.printf("'%15s' %n", "baeldung");

        // limit the number of characters (5), while formatting padding (8)
        System.out.printf("%8.5s %n", "Hi there!");

        // char formatting, uppercase
        System.out.printf("%c%n", 's');
        System.out.printf("%C%n", 's');

        // INTEGER Formatting:
        System.out.printf("simple integer: %d%n", 10000L);

        System.out.printf(Locale.US, "%,d %n", 10000);
        System.out.printf(Locale.ITALY, "%,d %n", 10000);

        // control precision
        System.out.printf("'%5.2f'%n", 5.1473);
        // mathematical expresion "e"
        System.out.printf("'%5.2e'%n", 5.1473);

        Date date = new Date(99999999L);
        System.out.printf("%tT%n", date);
        System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);

        /*
         * ‘A' – prints out the full day of the week ‘d' – formats a two-digit day of
         * the month ‘B' – is for the full month name ‘m' – formats a two-digit month
         * ‘Y' – outputs a year in four digits ‘y' – outputs the last two digits of the
         * year
         */
        System.out.printf("%1$tA, %1$tB %1$tY %n", date);
        System.out.printf("%1$td.%1$tm.%1$ty %n", date);

    }
}
