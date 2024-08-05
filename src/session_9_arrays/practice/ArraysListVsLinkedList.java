package session_9_arrays.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraysListVsLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int index = 0; index < 500000; index++) {
            arrayList.add(String.valueOf(index));
            linkedList.add(String.valueOf(index));
        }

        //check if session_16_java_collections_framework.session_17_equals_hashcode_generics.session_19.challenges.LinkedList is faster for add method
        long startTimerArrayList = System.currentTimeMillis();
        for (int index = 0; index < 100000; index++) {
            arrayList.add(0, String.valueOf(index));
        }
        long endTimerArrayList = System.currentTimeMillis();

        long startTimerLinkedList = System.currentTimeMillis();
        for (int index = 0; index < 100000; index++) {
            linkedList.add(0, String.valueOf(index));
        }
        long endTimerLinkedList = System.currentTimeMillis();

        System.out.println("session_16_java_collections_framework.session_17_equals_hashcode_generics.session_19.challenges.session_16_java_collections_framework.session_17_equals_hashcode_generics.session_19.challenges.ArrayList time: " + (endTimerArrayList - startTimerArrayList));
        System.out.println("session_16_java_collections_framework.session_17_equals_hashcode_generics.session_19.challenges.LinkedList time: " + (endTimerLinkedList - startTimerLinkedList));
    }
}
