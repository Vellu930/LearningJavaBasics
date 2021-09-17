import java.util.Date;
import java.text.SimpleDateFormat;

/* public class countDateDifference {
    public static void main(String[] args) throws ParseException {
        String dateStart = "01/14/2021 09:29:58";
        String dateStop = "01/15/2021 10:31:48";

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");

        Date d1 = null;
        Date d2 = null;

        d1 = format.parse(dateStart);
        d2 = format.parse(dateStop);

        long diff = d2.getTime() - d1.getTime();
        System.out.println(diff);

        import java.text.SimpleDateFormat;
import java.util.Date; */

public class DateDifferentExample {

    public static void main(String[] args) {

        String dateStart = "01/02/2021 09:29:58";
        String dateStop = "28/12/2021 10:31:48";

        // HH converts hour in 24 hours format (0-23), day calculation
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);

            // in milliseconds
            long diff = d2.getTime() - d1.getTime();
            System.out.println(diff);

            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);

            System.out.print(diffDays + " days, ");
            System.out.print(diffHours + " hours, ");
            System.out.print(diffMinutes + " minutes, ");
            System.out.print(diffSeconds + " seconds.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}