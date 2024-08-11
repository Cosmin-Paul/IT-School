package session_16_java_collections_framework.challenges.tree_map;

import java.util.Map;
import java.util.TreeMap;

public class Challenge_16 {
    public static void main(String[] args) {
        TreeMap<Integer, String> myKey = new TreeMap<>();

        myKey.put(3, "Chocolate");
        myKey.put(5, "Cake");
        myKey.put(9, "Candy");
        myKey.put(13, "Marshmellow");
        myKey.put(29, "Bubblegum");
        myKey.put(36, "Cotton candy");
        myKey.put(47, "Ice cream");
        myKey.put(54, "Milk shake");

        int key = 54;

        Map.Entry<Integer, String> lowerEntry = myKey.lowerEntry(54);
        if (lowerEntry != null) {
            System.out.println("Greatest key-value mapping strictly less than " + key + " is: " + lowerEntry);
        } else {
            System.out.println("Null");
        }
    }
}