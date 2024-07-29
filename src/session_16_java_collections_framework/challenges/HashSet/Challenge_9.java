package session_16_java_collections_framework.challenges.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Challenge_9 {
    public static void main(String[] args) {
        HashSet<Character> mySet = new HashSet<>();
        mySet.add('C');
        mySet.add('D');
        mySet.add('I');
        mySet.add('M');
        mySet.add('W');
        mySet.add('Z');

        List<Character> myList = new ArrayList<>(mySet);

        System.out.println(myList);
    }
}
