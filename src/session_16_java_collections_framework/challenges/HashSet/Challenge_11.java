package session_16_java_collections_framework.challenges.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Challenge_11 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(17);
        set1.add(18);
        set1.add(33);
        set1.add(9);
        set1.add(14);
        set1.add(25);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(58);
        set2.add(25);
        set2.add(17);
        set2.add(27);
        set2.add(33);

        set1.retainAll(set2);
        set2.retainAll(set1);
        System.out.println("Set1 after retain comon elements" + set1);
    }
}