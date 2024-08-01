package session_16_java_collections_framework.challenges.HashMap;

import java.util.HashMap;

public class Challenge_7 {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Monday", 1);
        myMap.put("Tuesday", 2);
        myMap.put("Wednesday", 3);
        myMap.put("Thursday", 4);
        myMap.put("Friday", 5);
        myMap.put("Saturday", 6);
        myMap.put("Sunday", 7);

        String checkKey = "Friday";

        boolean containKey = myMap.containsKey(checkKey);

        if (containKey) {
            System.out.println("This map contain the key: " + checkKey);
        } else {
            System.out.println("This map doesn't contain the key: " + checkKey);
        }
    }
}