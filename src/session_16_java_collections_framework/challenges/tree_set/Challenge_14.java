package session_16_java_collections_framework.challenges.tree_set;

import java.util.TreeSet;

public class Challenge_14 {
    public static void main(String[] args) {
        TreeSet<Integer> pairNumber = new TreeSet<>();

        pairNumber.add(20);
        pairNumber.add(40);
        pairNumber.add(60);
        pairNumber.add(80);
        pairNumber.add(100);

        System.out.println("Original list is: " + pairNumber);

        int removeFirstItem = 20;
        pairNumber.remove(Integer.valueOf(20));

        System.out.println("The list after removing first element is: " + pairNumber);
    }
}