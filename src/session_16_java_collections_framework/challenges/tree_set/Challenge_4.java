package session_16_java_collections_framework.challenges.tree_set;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Challenge_4 {
    public static void main(String[] args) {
        TreeSet<Integer> myInt = new TreeSet<>();

        myInt.add(2);
        myInt.add(9);
        myInt.add(11);
        myInt.add(39);
        myInt.add(72);
        myInt.add(96);

        System.out.println("The original list is: ");

        Collections.reverseOrder();

        System.out.println("The reverse order is: " + myInt);
    }
}