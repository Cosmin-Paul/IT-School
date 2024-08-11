package session_16_java_collections_framework.challenges.tree_map;

import java.util.TreeMap;

public class Challenge_4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> dogMap = new TreeMap<>();

        dogMap.put(1, "Rock");
        dogMap.put(3, "Rex");
        dogMap.put(7, "Mylo");
        dogMap.put(12, "Jess");
        dogMap.put(14, "Maya");
        dogMap.put(19, "Molly");

        String toFind = "Jess";

        if (dogMap.containsValue("Jess")) {
            System.out.println("In this dog map is: " + toFind);
        } else {
            System.out.println("In this dog map is not: " + toFind);
        }
    }
}