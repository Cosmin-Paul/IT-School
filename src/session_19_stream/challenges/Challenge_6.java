package session_19_stream.challenges;

import java.util.Arrays;

public class Challenge_6 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int sum = Arrays.stream(numbers)
                .reduce(0, Integer::sum);

        System.out.println("The sum of numbers is: " + sum);
    }
}
