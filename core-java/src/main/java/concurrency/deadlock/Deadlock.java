package concurrency.deadlock;

import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Deadlock {


    static class ABC {
        // instance variable of the class ABC
        int x = 30;
    }

    public static void main(String argvs[])
    {
        // creating an object of the class ABC
        ABC obj1 = new ABC();

        // it will copy the reference, not value
        ABC obj2 = new ABC();

        // updating the value to 6
        // using the reference variable obj2
        obj2.x = 6;

        // printing the value of x using reference variable obj1
        System.out.println("The value of x is: " + obj1.x);
    }
}



