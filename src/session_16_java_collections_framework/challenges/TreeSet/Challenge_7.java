package session_16_java_collections_framework.challenges.TreeSet;

import java.util.TreeSet;

public class Challenge_7 {
    public static void main(String[] args) {
        TreeSet<String> chocolateSortiment = new TreeSet<>();

        chocolateSortiment.add("Dark");
        chocolateSortiment.add("White");
        chocolateSortiment.add("Praline");
        chocolateSortiment.add("Mousse");
        chocolateSortiment.add("Pastery");
        chocolateSortiment.add("Fondant");
        chocolateSortiment.add("Tempered");

        int size = chocolateSortiment.size();
        System.out.println("Number of items: " + size);
    }
}