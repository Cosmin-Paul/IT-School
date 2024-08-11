package session_16_java_collections_framework.challenges.hash_set;

import java.util.HashSet;

public class Challenge_12 {
    public static void main(String[] args) {
        HashSet<String> paintSet = new HashSet<>();
        paintSet.add("Crayola");
        paintSet.add("Chalkboard");
        paintSet.add("Chalk");
        paintSet.add("Paper");
        paintSet.add("Oil colours");
        paintSet.add("Brush");
        paintSet.add("Cloth");

        System.out.println("The original paint set is: " + paintSet);

        paintSet.clear();
        System.out.println("HashSet after clearing: " + paintSet);
    }
}