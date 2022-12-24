import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class gregorianCal {
    /*this class is used to create an instance
    of gregorian calendar.we can change the year month & date using Set method!
*/
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);
    }
}
