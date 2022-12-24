class MyThread5 extends Thread{
    public void run(){
        int i=0;
        while (i<10){
            System.out.println("Thank-you ");
            try {
                Thread.sleep(100); // stop this Thread for 100 millis seconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class MyThread6 extends Thread{
    public void run(){
        int i = 0;
        while (i<10){
            System.out.println("Thanks! ");
            i++;
        }
    }
}
public class ThreadClass {
    public static void main(String[] args) throws InterruptedException {
        MyThread5 ta1 = new MyThread5();
        MyThread6 ta2 = new MyThread6();
        ta1.start();
        try{
            ta1.join(); // ta2 won,t get executed till ta1 gets finished
        }
        catch (Exception e){
            System.out.println(e);
        }
        /*java will try to join ta1 but if it won,t work then
        * catch will get executed(catching the exception)*/
        ta2.start();
    }
}
