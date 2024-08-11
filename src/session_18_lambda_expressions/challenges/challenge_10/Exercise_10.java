package session_18_lambda_expressions.challenges.challenge_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_10 {
    public static List<String> listNames(List<String> names, StringName nameFormat) {
        return nameFormat.firstName(names);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Marta,", "Joyce", "Thea", "Charlie", "Marck", "Rock");

        StringName upperSentance = (List<String> list) -> list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<String> upperSentanceNames = listNames(names, upperSentance);

        System.out.println("The names after uppercase are: " + upperSentanceNames);
    }
}