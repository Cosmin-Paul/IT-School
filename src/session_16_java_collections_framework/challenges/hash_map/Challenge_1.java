package session_16_java_collections_framework.challenges.hash_map;

import java.util.HashMap;

public class Challenge_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> myAnimal = new HashMap<>();
        myAnimal.put("Zebra", 2);
        myAnimal.put("Monkey", 5);
        myAnimal.put("Horse", 11);
        myAnimal.put("Llama", 21);
        myAnimal.put("Cobra", 35);
        myAnimal.put("Giraffe", 55);

        String value = "Hippo";
        int key = 3;

        myAnimal.put("Hippo", 3);

        System.out.println("My animals are: " + myAnimal);
    }
}