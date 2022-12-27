package concurrency.interthread.communication;

public class InterThreadCommunication {
    public static void main(String[] args) {
        Chat m = new Chat();
        new ThreadOne(m);
        new ThreadTwo(m);
    }
}
