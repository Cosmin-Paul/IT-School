package session_18_lambda_expressions.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge_1 {

    public static void main(String[] args) {
        List<Integer> myNumbers = Arrays.asList(1, 2, 5, 6, 8, 9, 12, 14, 17, 19, 24, 28);
        List<Integer> evenNumbers = myNumbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("The even numbers are: " + evenNumbers);
    }
}