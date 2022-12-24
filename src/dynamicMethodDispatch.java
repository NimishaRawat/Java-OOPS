//Dynamic method dispatch
// super obj = new sub();
// the method which is present in child class but not in parent class
// that can't be called
// method of sub class will execute if and only if it is an overrided method
class Phone{
    public void showTime(){
        System.out.println("Time is 8am");
    }
    public void name(){
        System.out.println("My name is Phone");
    }
}
class smartPhone extends Phone{
    public void playMusic(){
        System.out.println("Tan tna tan tan tan taraa");
    }
    public void name(){
        System.out.println("My name is Smart Phone");
    }
}
public class dynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new Phone();
        smartPhone obj1 = new smartPhone();
        //obj.name();
        Phone obj2 = new smartPhone(); //allowed
        // reference of super class
        // object of child class
//        smartPhone obj3 = new Phone(); not allowed
        obj2.name(); // method of child class would be run
        obj2.showTime();
//        obj2.playMusic(); it can't execute child class methods
    }
}
