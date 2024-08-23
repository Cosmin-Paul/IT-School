package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;

public class Challenge_7 {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Papaya");
        fruitList.add("Kiwi");
        fruitList.add("Grapes");
        fruitList.add("Ananas");
        fruitList.add("Peach");
        fruitList.add("Pear");

        String searchElement = "Peach";

        if (fruitList.contains(searchElement)) {
            System.out.println("This element has found in the list");
        } else {
            System.out.println("This element has not found in the list");
        }
    }
}