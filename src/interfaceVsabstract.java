// interfaces are group of empty bodies
// interfaces are group of compulsory methods
// it forces other classes who implement it to use these methods.
// you have to make those methods public
// you can implement more than one class
interface Bicycle{
    int a = 45;
    void applyBreak2(int decrement);
    void speedUp2(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee pee POO Poo");
    }
    public void applyBreak2(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp2(int increment){
        System.out.println("Appling speed up");
    }
}
public class interfaceVsabstract {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBreak2(10);
        // oyu can create properties in interfaces
        System.out.println(cycleHarry.a);
//        cycleHarry.a = 90; - error
        // you cannot modify the properties in Interfaces as
        // they are final
    }
}
