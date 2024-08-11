package session_16_java_collections_framework.challenges.hash_map;

import java.util.HashMap;

public class Challenge_6 {
    public static void main(String[] args) {
        HashMap<String, Integer> myList = new HashMap<>();

        myList.put("Tenis", 3);
        myList.put("Basket ball", 6);
        myList.put("Badminton", 2);
        myList.put("Ping pong", 7);
        myList.put("Volei", 9);
        myList.put("Billiard", 20);

        HashMap<String, Integer> copyMap = new HashMap<>(myList);

        System.out.println("The original map is: " + myList);
        System.out.println("The copyed map is: " + copyMap);
    }
}