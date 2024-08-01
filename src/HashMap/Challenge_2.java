package HashMap;

import java.util.HashMap;

public class Challenge_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> myCount = new HashMap<>();

        myCount.put("Cherry", 5);
        myCount.put("Pear", 9);
        myCount.put("Lime", 2);
        myCount.put("Papaya", 12);
        myCount.put("Coconut", 22);
        myCount.put("Grapefruit", 36);

        int size = myCount.size();

        System.out.println("The numbers of key-value are: " + size);
    }
}