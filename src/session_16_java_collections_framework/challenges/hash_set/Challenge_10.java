package session_16_java_collections_framework.challenges.hash_set;

import java.util.HashSet;

public class Challenge_10 {
    public static void main(String[] args) {
        HashSet<String> firstSet = new HashSet<>();
        firstSet.add("Pineapple");
        firstSet.add("Strawberry");
        firstSet.add("Watermellon");
        firstSet.add("Pear");
        firstSet.add("Mango");

        HashSet<String> secondSet = new HashSet<>();
        secondSet.add("Banana");
        secondSet.add("Papaya");
        secondSet.add("Blackberry");
        secondSet.add("Pomegrante");
        secondSet.add("Dragon fruit");

        boolean isEqual1 = firstSet.equals(secondSet);
        boolean isEqual2 = firstSet == secondSet;

        System.out.println("The both Has sets are equals? " + isEqual1);
        System.out.println("The both Has sets are equals? " + isEqual2);
    }
}