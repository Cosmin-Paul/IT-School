package session_16_java_collections_framework.challenges.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Challenge_3 {
    public static void main(String[] args) {
        LinkedList<String> soupIngredients = new LinkedList<>();

        soupIngredients.add("Carrot");
        soupIngredients.add("Parseley");
        soupIngredients.add("Celery");
        soupIngredients.add("Onion");
        soupIngredients.add("Salt");
        soupIngredients.add("Water");
        soupIngredients.add("Chicken meat");
        soupIngredients.add("Pepper");

        int startPosition = 3;

        if (startPosition < 0 || startPosition >= soupIngredients.size()) {
            System.out.println("Invalid to start index");
        }
        else {

        }
    }
}
