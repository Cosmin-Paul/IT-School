package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge_11 {
    public static void main(String[] args) {
        ArrayList<String> cakeRecipe = new ArrayList<>();
        cakeRecipe.add("Flower");
        cakeRecipe.add("Cornstach");
        cakeRecipe.add("Baking soda");
        cakeRecipe.add("Salt");
        cakeRecipe.add("Sugar");
        cakeRecipe.add("Salted butter");
        cakeRecipe.add("Orange extract");

        System.out.println("Original list is: " + cakeRecipe);

        Collections.reverse(cakeRecipe);
        System.out.println("Reversed elements of this list are: " + cakeRecipe);
    }
}