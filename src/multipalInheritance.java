// a single class can inherite properties of multipla
// interfaces
interface Bicycle1{
    int a = 45;
    void applyBreak2(int decrement);
    void speedUp2(int increment);
}
interface horn{
    void blowhorn();
    void stopHorn();
}
class AvonCycle1 implements Bicycle1, horn{
    public void blowhorn(){
        System.out.println("Pee pee POO Poo");
    }
    public void stopHorn(){
        System.out.println(".....");
    }
    public void applyBreak2(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp2(int increment){
        System.out.println("Appling speed up");
    }
}
public class multipalInheritance {
    public static void main(String[] args) {

    }
}
