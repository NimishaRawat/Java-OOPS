/*W.A.P to print "Good Morning" and "Welcome" continuously
* on the screen in Java using Threads.*/
/*Add a sleep method in welcome thread of Q1 to delay its
 * execution for 200ms. */
/*Demonstrate getPriority() and setPriority() methods in
* java Threads. */
/*How to get reference to the current thread in java*/
class gm extends Thread{
    public void run(){
        int i=0;
        while (i<200){
            System.out.println("Good Morning!");
            i++;
        }
    }
}
class wel extends Thread{
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("Welcome!");
//            try {
//                wel.sleep(200);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            i++;
        }
    }
}
public class Q1Thread {
    public static void main(String[] args) {
        gm g = new gm();
        wel w = new wel();
        w.setPriority(2);
        System.out.println(g.getPriority());
        System.out.println(w.getPriority());
        System.out.println(w.getState());
//        g.start();
       //w.start();
        System.out.println(w.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
