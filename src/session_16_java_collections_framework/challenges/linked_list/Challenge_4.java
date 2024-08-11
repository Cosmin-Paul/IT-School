package session_16_java_collections_framework.challenges.linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class Challenge_4 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(2);
        myList.add(4);
        myList.add(12);
        myList.add(14);
        myList.add(16);

        System.out.println("This is the original list");

        Collections.reverse(myList);
        System.out.println(myList);
    }
}