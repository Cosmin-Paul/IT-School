package session_18.practice;

import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        Function<String, Integer> strLengthFinder = str -> str.length();
        System.out.println(strLengthFinder.apply("Hello"));
    }
}