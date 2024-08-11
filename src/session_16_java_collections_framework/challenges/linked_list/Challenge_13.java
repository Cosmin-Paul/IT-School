package session_16_java_collections_framework.challenges.linked_list;

import java.util.LinkedList;

public class Challenge_13 {
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

        System.out.println("Original list: " + pairNumber);

        pairNumber.removeFirst();
        pairNumber.removeLast();

        System.out.println("List without first and last item" + pairNumber);
    }
}