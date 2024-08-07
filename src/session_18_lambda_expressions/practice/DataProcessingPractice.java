package session_18_lambda_expressions.practice;

import java.util.Arrays;
import java.util.List;

public class DataProcessingPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "John");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        //var 2

        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}

