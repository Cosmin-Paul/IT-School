package session_16_java_collections_framework.challenges.tree_map;

import java.util.TreeMap;

public class Challenge_2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> myMap = new TreeMap<>();
        myMap.put(1, "Red");
        myMap.put(2, "Green");
        myMap.put(3, "White");
        myMap.put(4, "Dark blue");
        myMap.put(5, "Brown");
        myMap.put(6, "Indigo");
        myMap.put(7, "Orange");

        TreeMap<Integer, String> copyOfMap = new TreeMap<>();
        copyOfMap.putAll(myMap);

        System.out.println("The original map is: " + myMap);
        System.out.println("The copyed map is: " + copyOfMap);
    }
}