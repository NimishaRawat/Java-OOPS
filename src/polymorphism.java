// Polymorphism
// Interfaces don't have objects they have reference
interface myCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void recordAudio(){
        greet();
        System.out.println("Recording Audio....");
    }
}
interface wifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class cellPhone{
    void call(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
class smartPhone1 extends cellPhone implements  wifi , myCamera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording....");
    }
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Nimisha", "Jio"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        myCamera cam1 = new smartPhone1(); // this is a smartphone but use it as camera
        // cam1.getNetworks(); -- not allowed
        cam1.recordAudio();
        cam1.takeSnap();
        //cam1.connectingToNetwork(); -- not allowed
        smartPhone1 s = new smartPhone1();
        s.call(936427);
    }
}
