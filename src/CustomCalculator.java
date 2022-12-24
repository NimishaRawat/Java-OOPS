import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class CustomCalculator {
    public static void main(String[] args) {
//        ArrayList ar = new ArrayList<>();
//        ar.add("NIra");
//        ar.add("NIra");
//        ar.add("NIra");
//        ar.add("NIra");
//        ar.add("NIra");
//        ar.add("NIra");
//        ar.add("NIra");
//        for(Object o : ar){
//            System.out.println(o);
//        }
        /*HashSet<Integer> s = new HashSet<>(); // set in java
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(9);
        System.out.println(s);*//*
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        */
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        String myDate = dt.format(df);
        System.out.println(myDate);
    }
}
