package session_16_java_collections_framework.challenges.linked_list;

import java.util.LinkedList;

public class Challenge_2 {
    public static void main(String[] args) {
        LinkedList<String> soupIngredients = new LinkedList<>();

        soupIngredients.add("Carrot");
        soupIngredients.add("Parsley");
        soupIngredients.add("Celery");
        soupIngredients.add("Onion");
        soupIngredients.add("Salt");
        soupIngredients.add("Water");
        soupIngredients.add("Chicken meat");
        soupIngredients.add("Pepper");

        for (int i = 0; i < 8; i++) {
            System.out.println(soupIngredients.get(i));
        }
    }
}