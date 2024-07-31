package session_16_java_collections_framework.challenges.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Challenge_6 {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Cherry");
        fruitsList.add("Mango");
        fruitsList.add("Papaya");
        fruitsList.add("Orange");
        fruitsList.add("Lemon");

        int firstPosition = 0;
        String firstElement = "Coconut";

        int lastPosition = 6;
        String lastElement = "Peach";

        fruitsList.add(0, "Coconut");
        fruitsList.add(6, "Peach");

        System.out.println(fruitsList);
    }
}