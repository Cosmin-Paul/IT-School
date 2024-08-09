package session_19_stream.challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge_1 {
    public static void main(String[] args) {

        List<Integer> myNumbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        List<Integer> evenNumbers = myNumbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("The even numbers are: " + evenNumbers);
    }
}