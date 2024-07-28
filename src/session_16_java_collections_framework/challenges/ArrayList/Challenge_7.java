package session_16_java_collections_framework.challenges.ArrayList;

import java.util.ArrayList;

public class Challenge_7 {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Papaya");
        fruitList.add("Watermelon");
        fruitList.add("Kiwi");
        fruitList.add("Grapes");
        fruitList.add("Ananas");
        fruitList.add("Peach");
        fruitList.add("Cherry");
        fruitList.add("Blueberry");
        fruitList.add("Strawberry");
        fruitList.add("Pear");

        String searchElement = "Peach";

        if (fruitList.contains(searchElement)) {
            System.out.println("This element has found in the list");
        } else {
            System.out.println("This element has not found in the list");
        }
    }
}