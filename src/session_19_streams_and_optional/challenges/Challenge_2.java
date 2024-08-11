package session_19_streams_and_optional.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Challenge_2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Cherry", "Banana", "Lime", "Blackberry");
        Optional<String> longestWord = strings.stream()
                .max(Comparator.comparing(String::length));

        System.out.println("The longest word is: " + longestWord);
    }
}