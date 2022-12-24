import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatter1 {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = ld.format(df);
        System.out.println(myDate);
    }
}
