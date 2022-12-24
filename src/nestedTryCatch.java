import java.util.Scanner;

public class nestedTryCatch {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 7;
        marks[1] = 8;
        marks[2] = 19;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            System.out.println("Enter the value of index : ");
            int ind = sc.nextInt();
            try{
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("This index doesn't exists");
                    System.out.println("Exception in Level 2");

                }
            }
            catch(Exception e){
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
