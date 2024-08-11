package session_19_streams_and_optional.practice;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExemple {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 9);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of numbers: " + sum);
    }
}