package session_16_java_collections_framework.challenges.tree_map;

import java.util.TreeMap;

public class Challenge_3 {
    public static void main(String[] args) {
        TreeMap<Integer, String> searchKey = new TreeMap<>();

        searchKey.put(1, "Red");
        searchKey.put(2, "Green");
        searchKey.put(3, "White");
        searchKey.put(4, "Dark blue");
        searchKey.put(5, "Brown");
        searchKey.put(6, "Indigo");
        searchKey.put(7, "Orange");

        Integer itemToSearch = 6;

        if (searchKey.containsKey(itemToSearch)) {
            System.out.println("This list contain the searched item: " + itemToSearch);
        } else {
            System.out.println("In this list are not the searched item: " + itemToSearch);
        }
    }
}