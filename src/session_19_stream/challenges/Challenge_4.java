package session_19_stream.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge_4 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        String result = strings.stream()
                .collect(Collectors.joining(" ,"));

        System.out.println("Elements separated with coma: " + result);
    }
}