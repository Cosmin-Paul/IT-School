package session_16_java_collections_framework.challenges.tree_map;

import java.util.NavigableSet;
import java.util.TreeMap;

public class Challenge_10 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Pine");
        treeMap.put(5, "Ash");
        treeMap.put(12, "Oak");
        treeMap.put(19, "Platanus");
        treeMap.put(35, "Walnut");
        treeMap.put(70, "Acer");

        System.out.println("The original map is: " + treeMap);

        NavigableSet<Integer> reversedKeys = treeMap.descendingKeySet();
        System.out.println("The reversed keys are: " + reversedKeys);
    }
}