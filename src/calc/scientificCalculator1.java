package calc;

import static java.lang.Math.sin;

class calculator{
    public void calculator(int a , int b){
        System.out.println("Your result is :"+ a+b);
    }
}
class scCalculator{
    public void calculator(int a , int b){
        System.out.println("Your result is :"+ sin(a+b));
    }
}
class hybridCalculator{
    public void calculator(int a , int b){
        System.out.println("Your result is :"+ a+b);
        System.out.println("Your result is :"+ sin(a+b));
    }
}
public class scientificCalculator1 {
    public static void main(String[] args) {
        System.out.println("I am main method");
    }
}
