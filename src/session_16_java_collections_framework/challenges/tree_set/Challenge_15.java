package session_16_java_collections_framework.challenges.tree_set;

import java.util.TreeSet;

public class Challenge_15 {
    public static void main(String[] args) {
        TreeSet<Integer> myInt = new TreeSet<>();

        myInt.add(10);
        myInt.add(25);
        myInt.add(35);
        myInt.add(45);
        myInt.add(55);
        myInt.add(85);
        System.out.println("The original list is: " + myInt);

        int removeLastItem = 85;
        myInt.remove(Integer.valueOf(85));

        System.out.println("List after removing first item is: " + myInt);
    }
}