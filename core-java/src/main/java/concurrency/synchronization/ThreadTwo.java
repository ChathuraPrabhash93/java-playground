package concurrency.synchronization;

public class ThreadTwo extends Thread {
    Table t;

    ThreadTwo(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}
