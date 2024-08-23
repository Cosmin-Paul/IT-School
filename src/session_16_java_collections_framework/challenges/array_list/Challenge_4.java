package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;

public class Challenge_4 {
    public static void main(String[] args) {

        ArrayList<String> myColours = new ArrayList<>();
        myColours.add("Yellow");
        myColours.add("Magenta");
        myColours.add("Ivory");
        myColours.add("Green Mamba");

        int i = 4;

        String element = myColours.get(4);
        System.out.println("Element at index " + i + ": " + element);
    }
}