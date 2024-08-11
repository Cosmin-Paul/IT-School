package session_19_streams_and_optional.challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge_7 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Development", "Streams");
        List<Integer> lengths = strings.stream()
                .map(String::length)
                .toList();

        System.out.println("The length of each word is" + lengths);
    }
}
