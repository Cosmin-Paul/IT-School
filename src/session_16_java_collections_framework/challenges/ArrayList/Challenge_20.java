package session_16_java_collections_framework.challenges.ArrayList;

import java.util.ArrayList;

public class Challenge_20 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Sunglases");
        myList.add("Sun protection");
        myList.add("Slipper");
        myList.add("Towel");

        System.out.println("The initial size of my list is: " + myList.size());

        myList.add("Water");
        myList.add("Music");
        myList.add("Beach scarf");
        System.out.println("The size after adding elements: " + myList.size());
    }
}