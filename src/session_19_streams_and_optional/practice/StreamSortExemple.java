package session_19_streams_and_optional.practice;

import java.util.Arrays;
import java.util.List;

public class StreamSortExemple {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Abraham");

        names.stream()
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}