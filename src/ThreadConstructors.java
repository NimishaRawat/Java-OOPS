/*The thread class
Below are the commanly used constructor of
thread class:
1. Thread()
2. Thread(String name)
3. Thread(Runnable r)
4. Thread(Runnable r , String name)*/
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
//        while (true){
//            System.out.println("I am a thread");
//        }
    }
}
public class ThreadConstructors {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Nisha");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t1 "+ t1.threadId());
        System.out.println("Name of the Thread t1 = "+ t1.getName());
        System.out.println("The id of the thread t2 "+ t2.threadId());
        System.out.println("Name of the Thread t2 = "+ t2.getName());
            // getId() is replaced by threadId
    }
}
