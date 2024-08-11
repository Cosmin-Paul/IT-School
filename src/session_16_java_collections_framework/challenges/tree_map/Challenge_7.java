package session_16_java_collections_framework.challenges.tree_map;

import java.util.TreeMap;

public class Challenge_7 {
    public static void main(String[] args) {
        TreeMap<Integer,String> sortKey = new TreeMap<>();

        sortKey.put(1, "George");
        sortKey.put(11, "Timeea");
        sortKey.put(7, "Cornelia");
        sortKey.put(22, "Tamara");
        sortKey.put(9, "Joseph");

        sortKey.comparator();
        System.out.println("List after compation is: " + sortKey);
    }
}