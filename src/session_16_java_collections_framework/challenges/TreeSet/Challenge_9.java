package session_16_java_collections_framework.challenges.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Challenge_9 {
    public static void main(String[] args) {
        TreeSet<Integer> myNumber = new TreeSet<>();

        myNumber.add(15);
        myNumber.add(1);
        myNumber.add(2);
        myNumber.add(3);
        myNumber.add(4);
        myNumber.add(5);
        myNumber.add(6);
        myNumber.add(9);

        TreeSet<Integer> lessElement = new TreeSet<>(myNumber.headSet(7));
        System.out.println("The numbers less then 7 are: " + lessElement);
    }
}