import java.util.Random;
import java.util.Scanner;
import java.lang.Math.*;
import java.util.random.*;
public class rockPaperScissor {
    public static void main(String[] args) {
        //Fortune favours the brave :)
        Random s1 = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to show Rock Press 1\nIf you want to show Paper Press 2\nIf you want to show Scissor Press 3\n");
        int move = sc.nextInt();
        if(move == 1){
            System.out.println("You Rock");
        }else if(move == 2){
            System.out.println("You Paper");
        }else if(move == 3){
            System.out.println("You Scissor");
        }
//        int max = 3;
//        int min = 1;
        int s = s1.nextInt(3);
        if(s == 1){
            System.out.println("P.C Rock");
        }else if(s == 2){
            System.out.println("P.C Paper");
        }else if(s == 3){
            System.out.println("P.C Scissor");
        }
        if(s == 1){
            if(move == 2){
                System.out.println("You lose P.C wins");
            }
            else if(move == 3){
                System.out.println("You win P.C lose");
            }
            else if(move == 1){
                System.out.println("Both are same");
            }
        }
        else if(s==2){
            if(move == 1){
                System.out.println("You lose P.C wins");
            }
            else if(move == 3){
                System.out.println("You win P.C lose");
            }
            else if(move == 2){
                System.out.println("Both are same");
            }
        }
        else if(s==3){
            if(move == 1){
                System.out.println("You win P.C lose");
            }
            else if(move == 2){
                System.out.println("You lose P.C wins");
            }
            else if(move == 3){
                System.out.println("Both are same");
            }
        }
    }
}
