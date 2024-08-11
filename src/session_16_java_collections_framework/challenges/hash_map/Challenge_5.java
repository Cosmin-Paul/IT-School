package session_16_java_collections_framework.challenges.hash_map;

import java.util.HashMap;

public class Challenge_5 {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap1 = new HashMap<>();
        HashMap<String, Integer> myMap2 = new HashMap<>();

        myMap2.put("Zalau", 9);

        if (myMap1.isEmpty()) {
            System.out.println("Map 1 is empty");
        } else {
            System.out.println("The map 1 is not empty");
        }
        if (myMap2.isEmpty()) {
            System.out.println("Map 2 is empty");
        } else {
            System.out.println("The map 2 is not empty");
        }
    }
}