package session_16_java_collections_framework.challenges.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Challenge_14 {
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

        System.out.println("Initial list is: " + snakeSpecie);

        snakeSpecie.clear();
        System.out.println("List after clearing is: " + snakeSpecie);
    }
}