package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;

public class Challenge_3 {
    public static void main(String[] args) {

        ArrayList<String> myColours = new ArrayList<>();

        myColours.add("Pink watermelon");
        myColours.add("light blue");
        myColours.add("Red");
        myColours.add("Green");
        myColours.add("Brown");

        System.out.println("My list of colours is: " + myColours);

        myColours.add(0, "Green Mamba");
        System.out.println("Update list after insert 'Green mamba colour' at the first position " + myColours);
    }
}