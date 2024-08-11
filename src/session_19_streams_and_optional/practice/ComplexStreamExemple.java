package session_19_streams_and_optional.practice;

import java.util.Arrays;
import java.util.List;

public class ComplexStreamExemple {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Julia", "Abraham", "Jason");

        List<String> resultList = names.stream()

                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .toList();
        System.out.println(resultList);
    }
}