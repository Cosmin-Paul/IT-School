package session_18_lambda_expressions.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge_4 {
    public static void main(String[] args) {
        List<String> colour = Arrays.asList("Green", "White", "Purple", "Lila", "Yellow","Magenta");
        colour.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("The reversed list is: " + colour);
    }
}