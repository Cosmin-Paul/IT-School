package session_16_java_collections_framework.challenges.linked_list;

import java.util.LinkedList;

public class Challenge_19 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();

        intList.add(20);
        intList.add(25);
        intList.add(12);
        intList.add(40);
        intList.add(2);
        intList.add(9);

        System.out.println("The original list is: " + intList);

        intList.remove(0);
        System.out.println("The list after removing  first item is: " + intList.get(0));
    }
}