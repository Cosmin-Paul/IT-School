package session_16_java_collections_framework.challenges.hash_set;

import java.util.HashSet;

public class Challenge_3 {
    public static void main(String[] args) {
        HashSet<String> nephewsName = new HashSet<>();

        nephewsName.add("Mihai");
        nephewsName.add("Radu");
        nephewsName.add("Raul");
        nephewsName.add("Gabi");
        nephewsName.add("Cezar");

        int size = nephewsName.size();
        System.out.println("The number of elements is: " + size);
    }
}