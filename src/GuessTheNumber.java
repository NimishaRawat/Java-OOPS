import java.util.Random;
import java.util.Scanner;
/*
    create a class game . which allows a user to play "Guess the number"
    game once. Game should have the following methods :
    1. Constructor to generate random number
    2. takeUserInput() to take a user input of a number
    3. isCorrectNumber() to detect whether the number entered by the user
        is true
    4. getters and setters for noOfGuesses
    use properties such as noOfGuesses(int), etc to get this task done!
 */

class Game{
    public int inputNumber;
    public int numberOfGuesses ;
    public int number;
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }
    Game(){
        Random num = new Random();
        this.number = num.nextInt(100);
    }

    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    public boolean isCorrectNumber(int n , int n1){
        if(n>n1){
            System.out.println("Too high...");

        }else if(n<n1){
            System.out.println("Too less...");

        }else if(n==n1){
            System.out.println("You are right! in "+numberOfGuesses+" attempts");
            return true;
        }
        numberOfGuesses++;
        return false;
    }
}
public class GuessTheNumber{

    public static void main(String[] args) {
        Game obj = new Game();

        while(!obj.isCorrectNumber(obj.inputNumber, obj.number)){
                obj.takeUserInput();
        }
    }
}
