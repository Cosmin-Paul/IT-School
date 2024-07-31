package session_16_java_collections_framework.challenges.TreeSet;

import java.util.TreeSet;

public class Challenge_16 {
    public static void main(String[] args) {
        TreeSet<String> candyStore = new TreeSet<>();

        candyStore.add("Candy");
        candyStore.add("Bubble gum");
        candyStore.add("Ice cream");
        candyStore.add("Nougat");
        candyStore.add("MMM's");
        candyStore.add("Skittels");
        candyStore.add("Hershey");
        candyStore.add("Harribo");
        candyStore.add("Fudge");
        candyStore.add("Chocolate");
        candyStore.add("Marshmellow");

        System.out.println("The original list is: " + candyStore);

        String itemToRemove = "Skittles";
        candyStore.remove(String.valueOf("Skittels"));

        System.out.println("List after remove an element is: " + candyStore);
    }
}