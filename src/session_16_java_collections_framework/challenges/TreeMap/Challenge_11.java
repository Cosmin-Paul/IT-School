package session_16_java_collections_framework.challenges.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Challenge_11 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Pine");
        treeMap.put(5, "Ash");
        treeMap.put(12, "Oak");
        treeMap.put(19, "Platanus");
        treeMap.put(35, "Walnut");
        treeMap.put(70, "Acer");

        System.out.println("The original map is: " + treeMap);

        int givenKey = 35;

        Map.Entry<Integer, String> Key = treeMap.floorEntry(givenKey);

        if (Key != null) {
            System.out.println("Key-value for the greatest key less than or equal to: " + givenKey + " is " + Key.getValue());
        } else {
            System.out.println("No key found" + givenKey);
        }
    }
}