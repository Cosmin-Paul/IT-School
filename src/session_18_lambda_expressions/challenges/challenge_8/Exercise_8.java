package session_18_lambda_expressions.challenges.challenge_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_8 {
    public static List<Integer> myMap(List<Integer> list, IntFunction function) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : list) {
            result.add(function.value(value));
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> myNumbers = Arrays.asList(1,2, 4, 6,8, 9, 12, 18, 26, 29);
        IntFunction function = (Integer x) -> x * x;

        List<Integer> functionNumbers = myMap(myNumbers, function);
        System.out.println(functionNumbers);
    }
}