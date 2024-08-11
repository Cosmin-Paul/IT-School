package session_16_java_collections_framework.challenges.tree_map;

import java.util.TreeMap;

public class Challenge_1 {
    public static void main(String[] args) {

        TreeMap<Integer, String> myMap = new TreeMap<>();

        myMap.put(1, "Wien");
        myMap.put(2, "Madrid");
        myMap.put(3, "Montreal");
        myMap.put(4, "Rio de Janeiro");
        myMap.put(5, "Sao Paolo");
        myMap.put(6, "Sancta Catarina");

        System.out.println(myMap);
    }
}