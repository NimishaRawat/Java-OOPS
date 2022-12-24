/*Exception class in java
* We can write our custom exceptions using exception
* class in java
* public class Myexception extends Exception{
*       //overidden methods
* }
* The exception class has following important methods :
* 1. String toString() -> executed when sout(e) is run
* 2. void printStackTrace() -> prints stack trace
* 3. String getMessage() -> prints the exception message*/
import java.util.Calendar;
import java.util.TimeZone;

public class exceptionClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}
