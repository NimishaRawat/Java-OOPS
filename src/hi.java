import java.util.Scanner;
public class hi {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int maths = sc.nextInt();
       int physics = sc.nextInt();
       int chemistry = sc.nextInt();
       int hindi = sc.nextInt();
       int english = sc.nextInt();
       int result = (maths + physics + chemistry + hindi + english );
       float result1 =  result * (0.2f);
        System.out.println(result1);
    }
}
