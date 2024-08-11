package session_16_java_collections_framework.challenges.hash_set;

import java.util.HashSet;

public class Challenge_2 {
    public static void main(String[] args) {
        HashSet<Character> allVowels = new HashSet<>();
        allVowels.add('A');
        allVowels.add('E');
        allVowels.add('I');
        allVowels.add('O');
        allVowels.add('U');

        for (char z = 0; z < 1; z++) {
            System.out.println(allVowels);
        }
    }
}