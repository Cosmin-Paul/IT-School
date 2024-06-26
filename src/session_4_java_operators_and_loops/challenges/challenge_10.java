package session_4_java_operators_and_loops.challenges;

import java.util.ArrayList;

public class challenge_10 {
    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Element1");
        listOne.add("Element2");
        listOne.add("Element3");

        ArrayList<String> listTwo = listOne;
        listOne.add("Element4");

        System.out.println("Content of listOne: " + listOne);
        System.out.println("Content of listTwo: " + listTwo);
    }
}