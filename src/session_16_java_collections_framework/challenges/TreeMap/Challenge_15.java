package session_16_java_collections_framework.challenges.TreeMap;

import java.util.TreeMap;

public class Challenge_15 {
    public static void main(String[] args) {
        TreeMap<Integer, String> allKey = new TreeMap<>();

        allKey.put(3, "Chocolate");
        allKey.put(5, "Cake");
        allKey.put(9, "Candy");
        allKey.put(13, "Marshmellow");
        allKey.put(29, "Bubblegum");
        allKey.put(38, "Cotton candy");
        allKey.put(47, "Ice cream");
        allKey.put(54, "Milk shake");

        System.out.println("The original list is: " + allKey);

        int key = 29;
        Integer ceilingKey = allKey.ceilingKey(key + 1);

        if (ceilingKey != null) {
            System.out.println("Least key strictly greater than " + key + " is: " + ceilingKey);
        } else {
            System.out.println("Null ");
        }
    }
}