package session_16_java_collections_framework.challenges.TreeSet;

import java.util.TreeSet;

public class Challenge_11 {
    public static void main(String[] args) {
        TreeSet<Integer> myInt = new TreeSet<>();

        myInt.add(1);
        myInt.add(2);
        myInt.add(3);
        myInt.add(4);
        myInt.add(6);
        myInt.add(7);
        myInt.add(8);
        myInt.add(9);
        myInt.add(10);

        TreeSet<Integer> lessNumber = new TreeSet<>(myInt.descendingSet());
        System.out.println("Elements who are less or equal to 10 are:" + lessNumber.tailSet(10));
    }
}