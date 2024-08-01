package session_16_java_collections_framework.challenges.HashMap;

import java.util.HashMap;

public class Challenge_4 {
    public static void main(String[] args) {
        HashMap<String, Integer> myCar = new HashMap<>();

        myCar.put("Honda", 4);
        myCar.put("Kia", 2);
        myCar.put("Mercedes Benz", 1);
        myCar.put("Rools Royce", 6);
        myCar.put("Volkswagen", 10);
        myCar.put("Opel", 7);
        myCar.put("Lexus", 8);

        System.out.println("Tis is the original list: " + myCar);

        myCar.clear();
        System.out.println("The list after clearing: " + myCar);
    }
}
