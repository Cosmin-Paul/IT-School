package session_16_java_collections_framework.challenges.hash_map;

import java.util.HashMap;

public class Challenge_3 {
    public static void main(String[] args) {

        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Honda", 4);
        myMap.put("Kia", 2);
        myMap.put("Mercedes Benz", 1);
        myMap.put("Rools Royce", 6);
        myMap.put("Volkswagen", 10);
        myMap.put("Opel", 7);
        myMap.put("Lexus", 8);

        HashMap<String, Integer> theCopy = new HashMap<>();
        theCopy.putAll(myMap);

        System.out.println("The original map is: " + myMap);
        System.out.println("The copyed map is: " + theCopy);
    }
}