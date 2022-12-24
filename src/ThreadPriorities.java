/*Tha JVM defines a range of ten logical priorities for java threads, including :
  java.lang.Thread.MIN_PRIORITY = 1
* java.lang.Thread.NORM_PRIORITY = 5
* java.lang.Thread.MAX_PRIORITY = 10*/
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        //System.out.println("Thank you "+ this.getName());
        while(true){
            System.out.println("Thank you "+ this.getName());
        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        // Ready Queue :T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("NimishaR");
        MyThr1 t2 = new MyThr1("NimishaIsTheBest");
        MyThr1 t3 = new MyThr1("Priya");
        MyThr1 t4 = new MyThr1("Naina");
        MyThr1 t5 = new MyThr1("Arjun");
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        // which thread gets executed is highly dependent on the os

    }
}
