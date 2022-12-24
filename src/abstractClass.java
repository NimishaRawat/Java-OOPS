// Abstract in english means -> existing in thought
// or as on idea without concrete existence
// Abstract method - A method that is declared without an implementation
// abstract void ( double X , double Y )
// Abstract class - If a class includes abstract methods,
// then the class itself must be declared abstract, as in:
// public abstract class PhoneModel{
//          abstract void swithoff();
//          more code
//          }
// when an abstract class is subclasses , the subclass
// usually provides implementations for all of the methods
// in parent class.If it doesn,t it must be declared abstract
// either use the abstract method in your subClass or
// declare the sub class as abstract
// abstract parent class Shape
// 3 child Circle , Rectangle and Rhombus
// 1. It is possible to create reference of an abstract class
// 2. It is not possible to create an object of an abstract class
abstract class abs{
    public abstract void greet();
}
class english extends abs{
    @Override
    public void greet() {
        System.out.println("hello");
    }
}
abstract class hindi extends abs{
    public void hello(){
        System.out.println("yo");
    }

}
public class abstractClass {
    public static void main(String[] args) {
        // abs obj = new abs(); -- error
        english obj = new english();
        //hindi obj1 = new hindi();
        //obj1.hello();
        obj.greet();
        //obj1.greet();
    }
}
