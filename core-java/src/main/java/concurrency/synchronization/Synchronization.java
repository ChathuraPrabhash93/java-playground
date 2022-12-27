package concurrency.synchronization;

public class Synchronization {
    public static void main(String args[]) {
        Table obj = new Table();//only one object
        ThreadOne t1 = new ThreadOne(obj);
        ThreadTwo t2 = new ThreadTwo(obj);
        t1.start();
        t2.start();
    }
}
