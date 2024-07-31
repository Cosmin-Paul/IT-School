package session_16_java_collections_framework.challenges.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Challenge_18 {
    public static void main(String[] args) {
        LinkedList<String> fastFood = new LinkedList<>();

        fastFood.add("Pizza");
        fastFood.add("Shaorma");
        fastFood.add("Souvlaki");
        fastFood.add("Burger");
        fastFood.add("Spagetti");
        fastFood.add("Hot Wings");
        fastFood.add("Barbecue");

        System.out.println("Original fast food list is: " + fastFood);

        LinkedList<String> clonedList = (LinkedList<String>) fastFood.clone();
        System.out.println("The cloned list is: " + fastFood);
    }
}