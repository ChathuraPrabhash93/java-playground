package concurrency.thread.local;

public class ThreadLocalDemo {
    public static void main(String args[]) {
        Counting commonInstance = new Counting();

        Thread t1 = new Thread(commonInstance);
        Thread t2 = new Thread(commonInstance);
        Thread t3 = new Thread(commonInstance);
        Thread t4 = new Thread(commonInstance);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
