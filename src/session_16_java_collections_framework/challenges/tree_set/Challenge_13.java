package session_16_java_collections_framework.challenges.tree_set;

import java.util.Collections;
import java.util.TreeSet;

public class Challenge_13 {
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

        myInt.remove(1);
        myInt.remove(10);

        System.out.println(myInt);
    }
}