package session_16_java_collections_framework.challenges.tree_map;

import java.util.Map;
import java.util.TreeMap;

public class Challenge_13 {
    public static void main(String[] args) {
        TreeMap<Integer, String> myTree = new TreeMap<>();
        myTree.put(2, "Carrot");
        myTree.put(5, "Onion");
        myTree.put(7, "Garlic");
        myTree.put(9, "Potato");
        myTree.put(25, "Celery");
        myTree.put(35, "Squash");
        myTree.put(40, "Mushroom");

        System.out.println("The original map is: " + myTree);

        int givenKey = 35;

        Map<Integer, String> sortedMap = myTree.headMap(givenKey);

        System.out.println("Portion of TreeMap with keys strictly less than " + givenKey + " is : " + sortedMap);
    }
}