package session_16_java_collections_framework.challenges.tree_map;

import java.util.TreeMap;

public class Challenge_12 {
    public static void main(String[] args) {
        TreeMap<Integer, String> myMap = new TreeMap<>();

        myMap.put(1, "Horse");
        myMap.put(2, "Porcupine");
        myMap.put(18, "Rabbit");
        myMap.put(32, "Hamster");
        myMap.put(44, "Snail");
        myMap.put(100, "Parrot");

        int key = 30;

        Integer givenKey = myMap.floorKey(key);

        if (givenKey != null) {
            System.out.println("The greatest key less than or equal to " + key + ": " + givenKey);
        } else {
            System.out.println("No key less than or equal to" + key);
        }
    }
}