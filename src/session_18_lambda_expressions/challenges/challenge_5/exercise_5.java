package session_18_lambda_expressions.challenges.challenge_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class exercise_5 {
    public static void main(String[] args) {

        MaxValue maxValue = list -> list.stream()
                .max(Integer::compareTo)
                .orElse(null);

        List<Integer> myNumbers = Arrays.asList(1, 23, 6, 7, 29, 12, 18, 36);
        Integer max = maxValue.maxValue(myNumbers);
        List<Integer> emptyList = Collections.emptyList();

        System.out.println("The max value from the list is: " + max);
        System.out.println("Maximum value in empty list: " + emptyList);
    }
}