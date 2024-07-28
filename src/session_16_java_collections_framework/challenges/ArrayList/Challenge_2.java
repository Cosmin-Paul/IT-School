package session_16_java_collections_framework.challenges.ArrayList;

import java.util.ArrayList;

public class Challenge_2 {
    public static void main(String[] args) {
        ArrayList<String> myColours = new ArrayList<>();

        myColours.add("Yellow");
        myColours.add("Magenta");
        myColours.add("Orange");
        myColours.add("Purple");
        myColours.add("Corail");
        myColours.add("Pink peach");

        for (int i = 0; i < 6; i++) {
            System.out.println(myColours.get(i));
        }
    }

}