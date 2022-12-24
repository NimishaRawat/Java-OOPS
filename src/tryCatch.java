import java.util.Scanner;

/**/
public class tryCatch {
    public static void main(String[] args) {
        /*int a = 6;
        int b = 0;
        try{
            int c = a/b; // arithmetic exception without try catch block
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }*/
        int []marks = new int [3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try{
            System.out.println("The vaue at array index entered is : "+marks[ind]);
            System.out.println("The value of array-value/number is : "+marks[ind]/number);
        }
        catch (ArithmeticException e) {
                System.out.println("Some exception occured!");
                System.out.println(e);
            }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Some exception occured!");
            System.out.println(e);
        }
    }
}
