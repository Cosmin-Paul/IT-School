package HashMap;

import java.util.HashMap;

public class Challenge_8 {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Monday", 1);
        myMap.put("Tuesday", 2);
        myMap.put("Wednesday", 3);
        myMap.put("Thursday", 4);
        myMap.put("Friday", 5);
        myMap.put("Saturday", 6);
        myMap.put("Sunday", 7);

        int CheckValue = 7;
        boolean containsValue = myMap.containsValue(7);

        if (containsValue) {
            System.out.println("This map contain the value: " + containsValue);
        } else {
            System.out.println("This map doesn't contain the value: " + containsValue);
        }
    }
}