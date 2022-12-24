//if the child class implements the same method present in the parent class again,
// it is known as method overriding
// when an object of subclass is created and the overrided method is called,
//the method which has been implemented in the subclass is called & its
// code is executed
// REDEFINING METHODS OF SUPER CLASS !
class A{
    public int a;
    public int nimisha(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    //class B has inherit all methods of class A
    // but I want that class B implement those methods with its own properties
    @Override  //this override notation is used so that if we made any changes
    // in owr program that makes owr method not a overrided method then it will
    // informs us that your method is not an oberrided metgod anymore
    // if I put some arguments in meth2 method then it is not an overridding
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class A");
    }
}
public class methodOverridding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2(); // meth2 has been overridded in child class
        // meth2 of class B is called and produced the output
    }
}
