package lambda.expression;

import lambda.expression.model.Employee;

import java.util.function.IntBinaryOperator;

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
        System.out.println("################### Section Break ####################### \n");



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

        // declare a reference to Calculator and assign a lambda expression to the reference
        Calculator calculator = (int num1, int num2) -> num1 + num2;
        // call the method of the interface
        System.out.println("Sum = " + calculator.calculate(2, 3));

        // same above `Calculator.calculate` function behavior using Java builtin `IntBinaryOperator` interface
        // declare a reference to Calculator and assign a lambda expression to the reference
        IntBinaryOperator operator = (num1, num2) -> num1 + num2;
        // call the method of the interface
        System.out.println("Sum = " + operator.applyAsInt(2, 3));
        System.out.println("################### Section Break ####################### \n");



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
        System.out.println("Lambda reversed with Generics = " + reverse.func("Generics"));

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
        System.out.println("################### Section Break ####################### \n");



        /**
         * More examples with Lambda Expressions - see implementations inside the `EmployeeUtils` class
         */
        Employee manager = new Employee("John", "Doe", 5, null, 1);
        Employee employee = new Employee("Jane", "Doe", 1, manager, 0);

        System.out.println(EmployeeUtils.getFullName(employee));
        System.out.println(EmployeeUtils.getManagersLastName(employee));
        System.out.println(EmployeeUtils.hasBeenEmployedLongerThanFiveYears(manager));
        System.out.println(EmployeeUtils.hasBeenEmployedLongerThanFiveYears(employee));
        System.out.println(EmployeeUtils.hasMoreThanThreeDirectReports(employee));
        System.out.println(EmployeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee));

    }
}
