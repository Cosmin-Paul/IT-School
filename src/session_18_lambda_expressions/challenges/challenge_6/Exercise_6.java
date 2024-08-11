package session_18_lambda_expressions.challenges.challenge_6;

import java.util.Arrays;
import java.util.List;

public class Exercise_6 {
    public static void main(String[] args) {

        StringComparator comparator = ((str1, str2) -> Integer.compare(str1.length(), str2.length()));

        List<String> colours = Arrays.asList("Blue", "Yellow", "Red", "Magenta");
        colours.sort(comparator::compare);

        System.out.println("The comparation of strings based on their length are: " + colours);
    }
}