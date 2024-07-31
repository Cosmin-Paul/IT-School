package session_16_java_collections_framework.challenges.LinkedList;

import java.util.LinkedList;

public class Challenge_8 {
    public static void main(String[] args) {
        LinkedList<Character> theVowels = new LinkedList<>();
        theVowels.add('A');
        theVowels.add('E');
        theVowels.add('I');
        theVowels.add('O');

        char lastWord = 'U';
        int lastItem = 4;

        theVowels.add(4, 'U');
        System.out.println(theVowels);
    }
}