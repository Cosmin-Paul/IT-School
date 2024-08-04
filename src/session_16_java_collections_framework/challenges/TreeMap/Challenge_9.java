package session_16_java_collections_framework.challenges.TreeMap;

import java.util.TreeMap;

public class Challenge_9 {
    public static void main(String[] args) {
        TreeMap<Integer, String> myMap = new TreeMap<>();

        myMap.put(1, "Mango");
        myMap.put(2, "Papaya");
        myMap.put(3, "Watermelon");
        myMap.put(4, "Kiwi");
        myMap.put(5, "Grapes");

        System.out.println("The original map is: " + myMap);

        int firstKey = myMap.firstKey();
        int lastKey = myMap.lastKey();

        System.out.println("The lowest key is: " + firstKey);
        System.out.println("The highest key is: " + lastKey);
    }
}