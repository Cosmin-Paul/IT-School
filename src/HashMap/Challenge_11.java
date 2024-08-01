package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Challenge_11 {
    public static void main(String[] args) {
        HashMap<String, Integer> pairMap = new HashMap<>();

        pairMap.put("20", 1);
        pairMap.put("40", 2);
        pairMap.put("60", 3);
        pairMap.put("80", 4);
        pairMap.put("100", 5);

        Set<String> viewKey = pairMap.keySet();
        System.out.println("The keys are: " + viewKey);
    }
}