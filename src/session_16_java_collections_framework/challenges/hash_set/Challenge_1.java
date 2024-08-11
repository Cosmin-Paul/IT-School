package session_16_java_collections_framework.challenges.hash_set;

import java.util.HashSet;

public class Challenge_1 {
    public static void main(String[] args) {
        HashSet<String> myColours = new HashSet<>();
        myColours.add("Violet");
        myColours.add("Indigo");
        myColours.add("Magenta");
        myColours.add("Lime yellow");
        myColours.add("Orange");
        myColours.add("Peach pink");

        System.out.println("My original list is: " + myColours);

        myColours.add("Green forest");

        System.out.println("Final list is after adding the last colour is: " + myColours);
    }
}
