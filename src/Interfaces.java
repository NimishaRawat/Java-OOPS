/* Interfaces in java
 Interface in english is a point where two systems meet and interact
 In java interface is a group of related methods with empty bodies
  Interface is being implemented in sub class where as class
  is being extended in sub class
 */

interface bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
// all the properties in interface are final
// thr bicycle interface is saying that If you will implement me
// you have to use the methods defined inside me(you have to declare those methods public
// or declare sub class as abstract
// Why we need interfaces when we have abstract classes ?
// You can implement one or more interfaces
class avonCycle implements bicycle{
    public int speed = 7;
    public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.println(speed);
    }
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println(speed);
    }
}
public class Interfaces {
    public static void main(String[] args) {
        // bicycle obj = new bicycle(); -- error
        bicycle obj = new avonCycle();
        avonCycle obj1 = new avonCycle();
        //obj1.a = 454; properties of interfaces are final you can't change them'
        //System.out.println(obj.speed); -- error
        obj.applyBrake(2);
        obj.speedUp(4);
        System.out.println(obj.a);
    }
}
