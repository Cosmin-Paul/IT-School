package HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Challenge_12 {
    public static void main(String[] args) {
        HashMap<String, Integer> pairMap = new HashMap<>();

        pairMap.put("20", 1);
        pairMap.put("40", 2);
        pairMap.put("60", 3);
        pairMap.put("80", 4);
        pairMap.put("100", 5);

        Collection<Integer> viewValues = pairMap.values();

        System.out.println("The view values are: " + viewValues);
    }
}