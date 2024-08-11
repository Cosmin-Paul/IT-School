package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge_14 {
    public static void main(String[] args) {
        ArrayList<Integer> evenList = new ArrayList<>();
        evenList.add(2);
        evenList.add(4);
        evenList.add(8);
        evenList.add(12);
        evenList.add(20);
        evenList.add(26);
        evenList.add(48);
        evenList.add(62);
        evenList.add(86);
        evenList.add(108);

        System.out.println("The original list of even numbers is: " + evenList);

        int i = 2;
        int j = 6;

        Collections.swap(evenList, 2, 6);

        System.out.println("The list of numbers before to swap elements is: " + evenList);
    }
}