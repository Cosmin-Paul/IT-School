package session_19_streams_and_optional.challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge_10 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Junior Developer", "Java Streams", "Method References", "Lambda Expressions");
        long totalCharacters = words.stream()
                .flatMapToInt(String::chars)
                .filter(Character::isLetterOrDigit)
                .count();

        System.out.println("Total characters into List are: " + totalCharacters);
    }
}