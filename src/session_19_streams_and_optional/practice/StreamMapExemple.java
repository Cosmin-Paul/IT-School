package session_19_streams_and_optional.practice;

import java.util.Arrays;
import java.util.List;

public class StreamMapExemple {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Abraham");
        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();

        System.out.println(upperCaseNames);
    }
}