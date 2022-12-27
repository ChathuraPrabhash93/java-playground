package concurrency.interthread.communication;

public class ThreadTwo implements Runnable {
    Chat m;
    String[] s2 = {"Hi", "I am good, what about you?", "Great!"};

    public ThreadTwo(Chat m2) {
        this.m = m2;
        new Thread(this, "Answer").start();
    }

    public void run() {

        for (int i = 0; i < s2.length; i++) {
            m.answer(s2[i]);
        }
    }
}
