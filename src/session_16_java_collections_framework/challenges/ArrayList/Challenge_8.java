package session_16_java_collections_framework.challenges.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge_8 {
    public static void main(String[] args) {
        ArrayList<String>fruitList = new ArrayList<>();
        fruitList.add("Kaki");
        fruitList.add("Grapes");
        fruitList.add("Passion fruit");
        fruitList.add("Mango");
        fruitList.add("Cherry");
        fruitList.add("Pomegrante");
        fruitList.add("Ananas");

        Collections.sort(fruitList);

        System.out.println(fruitList);
    }
}