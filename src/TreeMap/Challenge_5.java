package TreeMap;

import java.util.TreeMap;

public class Challenge_5 {
    public static void main(String[] args) {
        TreeMap<Integer,String> dogMap = new TreeMap<>();

        dogMap.put(1, "Rock");
        dogMap.put(3, "Rex");
        dogMap.put(7, "Mylo");
        dogMap.put(12, "Jess");
        dogMap.put(14, "Maya");
        dogMap.put(19, "Molly");

        System.out.println("The original list is: " + dogMap);

        dogMap.clear();

        System.out.println("The list after remove all the items is: " + dogMap);
    }
}