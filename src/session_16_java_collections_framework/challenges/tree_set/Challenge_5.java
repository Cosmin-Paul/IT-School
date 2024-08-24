package session_16_java_collections_framework.challenges.tree_set;

import java.util.TreeSet;

public class Challenge_5 {
    public static void main(String[] args) {
        TreeSet<Integer> myInt = new TreeSet<>();

        myInt.add(16);
        myInt.add(23);
        myInt.add(9);
        myInt.add(2);
        myInt.add(20);
        myInt.add(5);
        myInt.add(44);
        myInt.add(56);

        Integer firstElement = myInt.first();
        Integer lastElement = myInt.last();

        System.out.println("The first element is: " + firstElement);
        System.out.println("The last element is: " + lastElement);
    }
}