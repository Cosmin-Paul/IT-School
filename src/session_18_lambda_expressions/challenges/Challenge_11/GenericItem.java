package session_18_lambda_expressions.challenges.Challenge_11;

import java.util.List;

@FunctionalInterface
public interface GenericItem<T> {

    boolean contains(List<T> list, T item);
}