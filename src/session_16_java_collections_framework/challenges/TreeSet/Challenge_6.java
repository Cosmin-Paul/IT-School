package session_16_java_collections_framework.challenges.TreeSet;

import java.util.TreeSet;

public class Challenge_6 {
    public static void main(String[] args) {
        TreeSet<String> sweetBox = new TreeSet<>();

        sweetBox.add("Candy");
        sweetBox.add("Bubble gum");
        sweetBox.add("Ice cream");
        sweetBox.add("Nougat");
        sweetBox.add("Fudge");
        sweetBox.add("Chocolate");
        sweetBox.add("Marshmellow");

        System.out.println("Original list is: " + sweetBox);

        TreeSet<String> clonedList = new TreeSet<>(sweetBox);
        System.out.println("Cloned list is: " + clonedList);
    }
}