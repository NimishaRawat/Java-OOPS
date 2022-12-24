class one{
    int a;
    public int getA(){
        return a;
    }
    one(int a){ //constructor
        this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}
class two extends one{
    two(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class thisSuper {
    // this keyword - this is a way for us to reference an object of the class
    // which is being created / referenced.
    // this.area = 2; -> this is a reference to current object
    // super keyword
    // A reference variable used immediate parent class object
    // 1.Can be used to refer immediate parent class instance variable
    // 2.Can be used to invoke parent class methods
    // 3.can be used to invoke parent class constructor
    public static void main(String[] args) {
        one e = new one(5);
        two t = new two(5);
        System.out.println(e.getA());
    }
}
