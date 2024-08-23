package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;

public class Challenge_16 {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Potato");
        shoppingList.add("Carrot");
        shoppingList.add("Beans");
        shoppingList.add("Cauliflower");
        shoppingList.add("Cabbage");
        shoppingList.add("Eggplant");
        shoppingList.add("Celery");
        shoppingList.add("Garlic");
        shoppingList.add("Cilantro");
        shoppingList.add("Mushroom");

        ArrayList<String> clonedList = (ArrayList<String>) shoppingList.clone();

        System.out.println("The original shopping list is: " + shoppingList);
        System.out.println("The cloned list is: " + clonedList);
    }
}