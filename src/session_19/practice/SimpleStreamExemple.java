package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class SimpleStreamExemple {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Abraham");
        names.stream().forEach(n -> System.out.println(n));
    }
}