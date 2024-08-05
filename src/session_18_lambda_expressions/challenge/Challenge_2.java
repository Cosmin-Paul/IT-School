package session_18_lambda_expressions.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge_2 {
    public static void main(String[] args) {

        List<Character> initialWord = Arrays.asList('I', 'O', 'B', 'M', 'G', 'W', 'Z', 'K', 'J');
        initialWord.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("In aphabetical order, this list is:" + initialWord);
    }
}