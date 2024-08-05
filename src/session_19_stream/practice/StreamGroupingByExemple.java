package session_19_stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByExemple {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Julia", "Abraham", "Silvia", "Brad");

        Map<Character, List<String>> groupedByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(groupedByFirstLetter);
    }
}
