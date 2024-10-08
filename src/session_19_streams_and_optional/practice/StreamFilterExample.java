package session_19_streams_and_optional.practice;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Abraham");

        names.stream().filter(name -> name.startsWith("J"))
                .forEach(name -> System.out.println(name));
    }
}