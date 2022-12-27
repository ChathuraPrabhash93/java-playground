
public class MethodOverloading {

    /**
     * Method overloading is achieved by either:
     *      changing the number of arguments - method 1 and 2
     *      changing the data type of arguments - method 1 and 3
     * -----------------------------------------------------------------------
     * It is not method overloading if we only change the return type of methods.
     * Also, The same return type is not mandatory. Can be same or different - method 1, 3 and 4
     */

    private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    private static void display(String a){
        System.out.println("Got String object.");
    }

    private static boolean display(boolean a){
        System.out.println("Arguments: " + a);
        return a;
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
        display("Hello");
        display(true);
    }
}