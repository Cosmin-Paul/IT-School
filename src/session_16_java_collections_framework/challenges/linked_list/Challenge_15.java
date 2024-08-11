package session_16_java_collections_framework.challenges.linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class Challenge_15 {
    public static void main(String[] args) {
        LinkedList<String> snakeSpecie = new LinkedList<>();

        snakeSpecie.add("Pyton");
        snakeSpecie.add("Cobra");
        snakeSpecie.add("cobra");
        snakeSpecie.add("Green mamba");
        snakeSpecie.add("Anaconda");
        snakeSpecie.add("Coral snake");
        snakeSpecie.add("watter snake");
        snakeSpecie.add("Red krait");
        snakeSpecie.add("Vipera");

        System.out.println("Original list is: " + snakeSpecie);

        int x = 2;
        int y = 7;

        Collections.swap(snakeSpecie, 2, 7);

        System.out.println("List after swap 2 items: " + snakeSpecie);
    }
}