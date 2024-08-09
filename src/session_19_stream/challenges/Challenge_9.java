package session_19_stream.challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge_9 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World!", "Hello America!", "hello Juniors developers!", "Welcome to the first java job");

        Map<String, Long> countWord = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        String requentWord = countWord.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("THe most frequent used word is: " + requentWord);
    }
}