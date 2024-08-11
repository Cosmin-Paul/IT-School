package session_16_java_collections_framework.challenges.linked_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge_7 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("people");
        myList.add("!");
        myList.add(" Nice");
        myList.add("to");
        myList.add("meet");
        myList.add("all");
        myList.add("of");
        myList.add("you");

        int inFront = 0;
        String frontWord = "Hello";

        myList.add(0, "Hello");
        System.out.println(myList);
    }
}