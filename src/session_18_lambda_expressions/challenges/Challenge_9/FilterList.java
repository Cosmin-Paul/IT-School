package session_18_lambda_expressions.challenges.Challenge_9;

import java.util.List;

@FunctionalInterface
public interface FilterList {

    List<Integer> myList(List<Integer> list);
}