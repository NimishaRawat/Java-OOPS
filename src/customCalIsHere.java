class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Can not add 9 and 8";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Can not divide by 0";
    }
    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}
class CustomCal{
    double add(double a , double b) throws InvalidInputException{
        if(a==9 || b == 8){
            throw new InvalidInputException();
        }
        return a + b;
    }
    double sub(double a , double b){
        return a - b;
    }
    double mul(double a , double b){
        return a * b;
    }
    double div(double a , double b) throws CannotDivideByZeroException{
        if(b==0){
             throw new CannotDivideByZeroException();
        }
        return a/ b;
    }

}
public class customCalIsHere {
    public static void main(String[] args)  throws InvalidInputException , CannotDivideByZeroException{
        CustomCal c = new CustomCal();
        //c.add(9,8);
        c.div(8,0);
    }
}
