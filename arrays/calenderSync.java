
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class calenderSync {
    public static void main(String[] args) {
        /*
         * Based on given calenders, find free time for meetings of the two people.
         * Return any time frame, when both have not scheduled any meetings and is in a
         * given bound.
         */
        String bound = "10:00 - 18:30"; // bound is the working time

        ArrayList<List<String>> calender1 = new ArrayList<List<String>>();
        calender1.add(Arrays.asList("9:00 - 10:30"));
        calender1.add(Arrays.asList("12:00 - 13:00"));
        calender1.add(Arrays.asList("14:30 - 15:30"));

        for (List<String> list : calender1) {
            for (String i : list) {
                System.out.println(i + " ");
            }
        }
        // String[] calender2 = { "10:00 - 11:30", "12:30 - 14:30", "14:30 - 15:00",
        // "16:00 - 17:00" };

    }
}
