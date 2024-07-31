package session_16_java_collections_framework.challenges.LinkedList;

import java.util.LinkedList;

public class Challenge_12 {
    public static void main(String[] args) {
        LinkedList<Integer> pairNumber = new LinkedList<>();

        pairNumber.add(20);
        pairNumber.add(40);
        pairNumber.add(60);
        pairNumber.add(80);
        pairNumber.add(100);
        pairNumber.add(120);
        pairNumber.add(160);
        pairNumber.add(200);

        System.out.println("Original list is: " + pairNumber);

        int removeElement = 100;

        pairNumber.remove(Integer.valueOf(100));
        System.out.println("The list after removing an element is: " + pairNumber);
    }
}