package session_16_java_collections_framework.challenges.tree_map;

import java.util.Set;
import java.util.TreeMap;

public class Challenge_6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> myMap = new TreeMap<>();

        myMap.put(1, "George");
        myMap.put(11, "Timeea");
        myMap.put(7, "Cornelia");
        myMap.put(22, "Tamara");
        myMap.put(9, "Joseph");

        Set<Integer> allKeys = myMap.keySet();
        System.out.println("The all keys are: " + allKeys);
    }
}