package session_16_java_collections_framework.challenges.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Challenge_7 {
    public static void main(String[] args) {
        HashSet<String> carSet = new HashSet<>();
        carSet.add("Trabant");
        carSet.add("Lada");
        carSet.add("Lancia");
        carSet.add("Mitsubishi");
        carSet.add("Lexus");
        carSet.add("Rolls Royce");

        List<String> myList = new ArrayList<>(carSet);

        System.out.println(myList);
    }
}