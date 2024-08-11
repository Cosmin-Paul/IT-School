package session_16_java_collections_framework.challenges.tree_map;

import java.util.TreeMap;

public class Challenge_17 {
    public static void main(String[] args) {
        TreeMap<Integer, String> myTree = new TreeMap<>();

        myTree.put(9, "Apple");
        myTree.put(5, "Pear");
        myTree.put(11, "Grape");
        myTree.put(21, "Plum");
        myTree.put(6, "Cherry");
        myTree.put(1, "Elderberry");

        int key = 11;

        Integer lowerKey = myTree.lowerKey(key);

        if (lowerKey != null) {
            System.out.println("Greatest key strictly less than " + key + " is: " + lowerKey);
        } else {
            System.out.println("Null ");
        }
    }
}
