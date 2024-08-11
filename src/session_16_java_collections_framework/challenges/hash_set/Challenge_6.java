package session_16_java_collections_framework.challenges.hash_set;

import java.util.HashSet;

public class Challenge_6 {
    public static void main(String[] args) {
        HashSet<Character> myChar = new HashSet<>();

        myChar.add('A');
        myChar.add('B');
        myChar.add('C');
        myChar.add('X');
        myChar.add('Y');
        myChar.add('Z');

        System.out.println("This is the original char list: " + myChar);

        HashSet<Character> clonedChar = new HashSet<>(myChar);

        System.out.println("This is the cloned char HashSet: " + clonedChar);
    }
}