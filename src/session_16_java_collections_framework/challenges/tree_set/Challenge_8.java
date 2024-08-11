package session_16_java_collections_framework.challenges.tree_set;

import java.util.TreeSet;

public class Challenge_8 {
    public static void main(String[] args) {
        TreeSet<String> myColour1 = new TreeSet<>();

        myColour1.add("Indigo");
        myColour1.add("Blue");
        myColour1.add("Green");
        myColour1.add("Yellow");
        myColour1.add("Orange");

        TreeSet<String> myColour2 = new TreeSet<>();
        myColour2.add("Pink");
        myColour2.add("Red");
        myColour2.add("Magenta");
        myColour2.add("Lila");

        boolean isEqual1 = myColour1.equals(myColour2);
        boolean isEqual2 = myColour1 == myColour2;

        System.out.println("The both Has sets are equals? " + isEqual1);
        System.out.println("The both Has sets are equals? " + isEqual2);
    }
}