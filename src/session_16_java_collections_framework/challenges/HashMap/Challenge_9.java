package session_16_java_collections_framework.challenges.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Challenge_9 {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Sibiu", 2);
        myMap.put("Baia Mare", 3);
        myMap.put("Constanta", 10);
        myMap.put("Mamaia", 9);
        myMap.put("Costinesti", 20);
        myMap.put("Mangalia", 17);

        Set<Map.Entry<String, Integer>> entrySet = myMap.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}