package lambda.expression;

/**
 * functional interface has exactly one abstract method. Since default methods have an
 * implementation, they are not abstract, and they are not counted for functional interfaces.
 */
@FunctionalInterface
public interface PiInterface {
    /**
     * One and only abstract method
     */
    double getPiValue();

    /**
     * Can have one or more default methods
     */
    default void print(){
        System.out.println("Hey, I'm a default method");
    }
}
