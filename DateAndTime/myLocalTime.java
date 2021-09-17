import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class myLocalTime {
    public static void main(String[] args) {
        // get actual time and date now - separately for now
        LocalTime timeNow = LocalTime.now();
        LocalDate dateNow = LocalDate.now();
        // formatting the objects
        DateTimeFormatter formatingDate = DateTimeFormatter.ofPattern("dd'th' MMM yy");
        String newDate = dateNow.format(formatingDate);
        System.out.println(newDate);

        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm a ");
        String newTime = timeNow.format(formatTime);
        System.out.println(newTime);

    }
}