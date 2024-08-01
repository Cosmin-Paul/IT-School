package HashMap;

import java.util.HashMap;

public class Challenge_10 {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Blue", 1);
        myMap.put("Red", 9);
        myMap.put("Green", 3);
        myMap.put("Purple", 7);
        myMap.put("Pink", 22);
        myMap.put("Corail", 14);

        String key = "Pink";
        Integer getValue = myMap.get(key);

        if (getValue != null) {
            System.out.println("The value for the key is: " + getValue);

        } else {
            System.out.println("This key is not in this map");
        }
    }
}