import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        //a string is a sequence of characters
        // strings are immutable and can not be changed
        int a = 6;
        float b = 5.45678f;
        System.out.printf("The value of a = %d and value of b = %f",a,b);
        //format specifier
        System.out.println();
        System.out.format("The value of a = %d and value of b = %f",a,b);
        // both are same both will generate same output
        Scanner sc = new Scanner(System.in);
        String st = sc.next(); // for reading string up to white space
        System.out.println(st);
        String st1 = sc.nextLine(); // for reading the whole line
        System.out.println(st1);
        //String methods operates on java string. They can be used to find
        //length of the string, convert to lowercase, etc.
        System.out.format("The value of a = %d and value of b = %.2f",a,b);
        //it will print up to two decimals
        System.out.println();
        System.out.format("The value of a = %d and value of b = %8.2f",a,b);
        //it will also print up to two decimals and with preceding space of eight digits
        System.out.println();

    }
}
