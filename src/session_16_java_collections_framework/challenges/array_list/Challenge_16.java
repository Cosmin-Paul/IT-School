package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;

public class Challenge_16 {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Potato");
        shoppingList.add("Carrot");
        shoppingList.add("Beans");
        shoppingList.add("Cawliflower");
        shoppingList.add("Cabbage");
        shoppingList.add("Eggplant");
        shoppingList.add("Cellery");
        shoppingList.add("Garlic");
        shoppingList.add("Chilli pepper");
        shoppingList.add("Soia");
        shoppingList.add("Celantro");
        shoppingList.add("Squash");
        shoppingList.add("Sweet potato");
        shoppingList.add("Mushroom");

        ArrayList<String> clonedList = (ArrayList<String>) shoppingList.clone();

        System.out.println("The original shopping list is: " + shoppingList);
        System.out.println("The cloned list is: " + clonedList);
    }
}