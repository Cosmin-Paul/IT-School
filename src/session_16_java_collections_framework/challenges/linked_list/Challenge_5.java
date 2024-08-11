package session_16_java_collections_framework.challenges.linked_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge_5 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(13);
        myList.add(15);

        int position = 4;
        int elementToAdd = 23;

        myList.add(4, 23);
        System.out.println(myList);
    }
}