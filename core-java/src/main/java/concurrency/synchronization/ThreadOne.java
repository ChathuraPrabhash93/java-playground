package concurrency.synchronization;

public class ThreadOne extends Thread {
    Table t;

    ThreadOne(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}
