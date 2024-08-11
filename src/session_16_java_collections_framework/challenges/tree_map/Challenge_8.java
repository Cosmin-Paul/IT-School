package session_16_java_collections_framework.challenges.tree_map;

import java.util.Map;
import java.util.TreeMap;

public class Challenge_8 {
    public static void main(String[] args) {
        TreeMap<Integer, String> zooMap = new TreeMap<>();

        zooMap.put(1, "Tiger");
        zooMap.put(2, "Koala");
        zooMap.put(7, "Zebra");
        zooMap.put(4, "Gorilla");
        zooMap.put(21, "Turtle");

        Map.Entry<Integer,String> greatestKey = zooMap.firstEntry();

        System.out.println("The first entry is: " + greatestKey);
    }
}