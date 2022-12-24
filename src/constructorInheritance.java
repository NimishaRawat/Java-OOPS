//when a derived class is extended from the base class,
//the constructor base class is executed first followed by the
//constructor of the derived class.
// CONSTRUCTOR DURING CONSTRUCTOR OVERLOADING
//when there are multiple constructors in the parent class ,
// the constructor without any parameters is called form the child class
// if we want to call the constructor with parameters from the parent class,
// we can use super keyword
//super(a,b);
// calls the constructor form the parent class which takes 2 variables
class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a ){
        System.out.println("I am a overloaded constructor with value of a as:"+a);
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int a,int b){
        super(a);
        System.out.println("I am a overloaded constructor of derived with value of b as:"+b);
    }
}
class childOfDerived1 extends Derived1{
    childOfDerived1(){
        System.out.println("I am a child of derived constructor");
    }
    childOfDerived1(int a , int b , int c){
        super(a,b);
            System.out.println("I am an overloaded constructor of derived with values of c as :"+c);
    }
}
public class constructorInheritance{
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1(14,17);
        childOfDerived1 c = new childOfDerived1(14,15,17);
    }
}
