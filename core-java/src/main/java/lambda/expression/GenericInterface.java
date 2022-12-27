package lambda.expression;

@FunctionalInterface
public interface GenericInterface<T> {
    T func(T t);
}
