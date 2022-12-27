package concurrency.thread.local;

public class Counting implements Runnable {
    ThreadLocal<Integer> threadLocalCounter = new ThreadLocal<Integer>();

    public void run() {
        threadLocalCounter.set( (int) (Math.random() * 50D) );
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("threadLocalCounter: " + threadLocalCounter.get());
    }
}
