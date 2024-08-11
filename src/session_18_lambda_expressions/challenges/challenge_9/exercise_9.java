package session_18_lambda_expressions.challenges.challenge_9;

import java.util.Arrays;
import java.util.List;

public class exercise_9 {
    public static List<Integer> myList(List<Integer> list, FilterList myList) {
        return myList.myList(list);
    }

    public static void main(String[] args) {
        List<Integer> myNumbers = Arrays.asList(1, 2, 5, 8, 12, 21, 44, 31, 7, 15, 34,39,47, 52);

        FilterList oddList = (List<Integer> list) -> list.stream()
                .filter(x -> x % 2 != 0)
                .toList();

        List<Integer> oddNumbers = myList(myNumbers, oddList);
        System.out.println("The odd numbers are: " + oddNumbers);
    }
}