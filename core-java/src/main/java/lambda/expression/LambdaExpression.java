package lambda.expression;

public class LambdaExpression {

    /**
     * Lambda expression is, essentially, an anonymous or unnamed method.
     * The lambda expression does not execute on its own.
     * Instead, it is used to implement a method defined by a functional interface.     *
     */

    public static void main(String[] args) {

        /**
         * lambda expressions without any parameters.
         */
        // declare a reference to PiInterface
        PiInterface ref;
        // lambda expression
        ref = () -> 3.1415;
        System.out.println("Value of Pi = " + ref.getPiValue());

        // call the default method
        ref.print();
    }
}
