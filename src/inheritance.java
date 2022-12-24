class Base{
    //this is the parent class / base class / super class form which
    // Derived class borrow properties
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x ){
        System.out.println("I am setting X :");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    //this is sub class of base class
    //by using extends keyword all the things inside base get available in
    // Derived class but their accessibility depends on the access modifier
    // Derived class have base class properties as well as getY and
    // setY() methods of its own
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("I am setting Y :");
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        // I can also access setX() and getX() from Derived class
        Derived d = new Derived();
        d.setX(45);
        System.out.println(d.getX());
        // let,s call setY and getY through Derived class
        d.setY(5);
        System.out.println(d.getY());
        // but I can not call setY and getY through Base class
//        b.setY();
//        System.out.println(b.getY());
        // this will generate an error

    }
}
