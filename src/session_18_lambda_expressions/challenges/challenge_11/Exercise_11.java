package session_18_lambda_expressions.challenges.challenge_11;

import java.util.Arrays;
import java.util.List;

public class Exercise_11 {
    public static <T> boolean checkItem(List<T> list, T item, GenericItem<T> genericItem) {
        return genericItem.contains(list, item);
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 5, 7, 12, 19, 34, 56, 26, 28);

        GenericItem<Integer> intCheck = (list, item) -> list.contains(item);
        boolean containNumber56 = checkItem(numbers, 56, intCheck);
        System.out.println("This list contain number 56? " + containNumber56);

        //2

        boolean containNumber20 = checkItem(numbers, 20, intCheck);
        System.out.println("This list contain number 20? " + containNumber20);
    }
}