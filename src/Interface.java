interface camera{
    private void greeting(){
        System.out.println("Hello");
    }
    void takeSnap();
    void recordVideo();
    //can we add methods in interfaces without implementing them in \
    // child classes
    //yes by using default keyword
    default void recordAudio(){
        System.out.println("Recording Audio...");
    }
    // if you override this method in child class
    // then priority would be given to the child class method
}
interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling");
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
class mySmartPhone extends myCellPhone implements wifi , camera{
    public void recordAudio(){
        System.out.println("Recording Audio in smart Phone...");
    }
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Nimisha","Jio"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
public class Interface  {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        String []ans = ms.getNetworks();
        for(String arr : ans){
            System.out.println(arr);
        }
        ms.recordAudio();
    }
}
