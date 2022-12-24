/*Multiprocessing and multithreading both are used to achieve multitasking.
In a nut shell :
-> Threads use shared memory area
-> Threads -> Faster Context Switching
-> A thread is light weight where as a process is heavy weight.
Multitasking within a process is done by threads
Creating a thread
There are two ways to create a  thread in java
1. By extending Thread class.
2. By implementing Runnable interface.
*/
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("My Thread1 is Running ");
            System.out.println("I am Happy");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("My Thread2 is good ");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        Mythread2 t2 = new Mythread2();
        t1.start(); // java has in built thread clas
        // that have pre-defined start() method
        t2.start();
    }
}
