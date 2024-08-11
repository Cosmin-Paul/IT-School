package session_16_java_collections_framework.challenges.tree_map;

import java.util.Map;
import java.util.TreeMap;

public class Challenge_14 {
    public static void main(String[] args) {
        TreeMap<Integer, String> myMap = new TreeMap<>();

        myMap.put(2, "Carrot");
        myMap.put(5, "Onion");
        myMap.put(7, "Garlic");
        myMap.put(9, "Potato");
        myMap.put(25, "Celery");
        myMap.put(35, "Squash");
        myMap.put(40, "Mushroom");

        System.out.println("The original list is: " + myMap);

        int lessKey = 9;
        boolean isInclusive = true;

        Map<Integer, String> secondMap;
        if (isInclusive) {
            secondMap = myMap.headMap(lessKey + 1);
        } else {
            secondMap = myMap.headMap(lessKey);
        }
        System.out.println(secondMap);
    }
}