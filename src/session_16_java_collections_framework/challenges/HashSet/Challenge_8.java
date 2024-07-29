package session_16_java_collections_framework.challenges.HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Challenge_8 {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Whisky");
        mySet.add("Vodka");
        mySet.add("Cocktail");
        mySet.add("Rom");
        mySet.add("Martini");
        mySet.add("Mojito");

        TreeSet<String> myTreeSet = new TreeSet<>(mySet);

        System.out.println(myTreeSet);
    }
}