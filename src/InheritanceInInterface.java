// you can implement interface in class
//  interface can extend another interface
interface input1{
    void math1();
    void math2();
}
// rather then repeating yourself by writing
// same methods in input2 extends them form
// input1 interface
interface input2 extends input1{
    void math3();
    void math4();
}
class input3 implements input2{
    public void math1(){
        System.out.println("Math 1");
    }
    public void math2(){
        System.out.println("Math 2");
    }
    @Override
    public void math3(){
        System.out.println("Math 3");
    }
    public void math4() {
        System.out.println("Math 4");
    }
}
public class InheritanceInInterface {
    public static void main(String[] args) {
        //input1 in = new input1(); -- error
        input3 obj = new input3();
        obj.math1();
        obj.math2();
        obj.math3();
        obj.math4();
    }
}
