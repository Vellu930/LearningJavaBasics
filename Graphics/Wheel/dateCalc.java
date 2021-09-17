package Wheel;

import java.util.Date;
import java.text.SimpleDateFormat;

public class dateCalc {

    public long days(String dateStart) {
        Date currentDate = new Date();
        Date d1 = null;
        Date d2 = null;
        long diffDays = 0;

        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");

        try {
            d1 = form.parse(dateStart);
            d2 = currentDate;

            // in milliseconds
            long diff = d2.getTime() - d1.getTime();

            diffDays = diff / (24 * 60 * 60 * 1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Days: " + diffDays);
        return diffDays;
    }
}
