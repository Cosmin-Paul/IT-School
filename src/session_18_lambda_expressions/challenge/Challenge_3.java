package session_18_lambda_expressions.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge_3 {
    public static void main(String[] args) {
        List<Integer> myNumbers = Arrays.asList(2, 4, 5, 9, 7, 6, 12);

        int sum = myNumbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("The sum of all items are: " + sum);
    }
}