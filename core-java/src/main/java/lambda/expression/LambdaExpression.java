package lambda.expression;

public class LambdaExpression {

    /**
     * Lambda expression is, essentially, an anonymous or unnamed method.
     * The lambda expression does not execute on its own.
     * Instead, it is used to implement a method defined by a functional interface.
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
        // extra - call the default method
        ref.print();



        /**
         * Lambda Expressions with parameters
         */
        // declare a reference to ReverseUtilInterface and assign a lambda expression to the reference
        ReverseUtilInterface reverseUtil = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };
        // call the method of the interface
        System.out.println("Lambda reversed = " + reverseUtil.reverse("Lambda"));



        /**
         * Generic Functional Interface and Lambda Expressions
         */
        // declare a reference to GenericInterface
        // the GenericInterface operates on String data
        // assign a lambda expression to it
        GenericInterface<String> reverse = str -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Lambda reversed = " + reverse.func("Lambda"));

        // declare another reference to GenericInterface
        // the GenericInterface operates on Integer data
        // assign a lambda expression to it
        GenericInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("factorial of 5 = " + factorial.func(5));


    }
}
