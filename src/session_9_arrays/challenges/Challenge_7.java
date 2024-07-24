package session_9_arrays.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Challenge_7 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Watermelon", "Pear", "Pomegrante", "Banana", "Grape", "kiwi", "Papaya", "Mango", "Dragon Fruit"));

        Collections.sort(fruits, (fruits1, fruits2) -> Integer.compare(fruits2.length(), fruits1.length()));


        for (String frt : fruits) {
            System.out.println(frt + " " + frt.length());
        }
    }
}