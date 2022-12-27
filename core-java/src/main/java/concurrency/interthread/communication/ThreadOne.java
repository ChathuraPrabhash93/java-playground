package concurrency.interthread.communication;

public class ThreadOne implements Runnable {
    Chat m;
    String[] s1 = {"Hi", "How are you ?", "I am also doing fine!"};

    public ThreadOne(Chat m1) {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.question(s1[i]);
        }
    }
}
