package session_16_java_collections_framework.challenges.TreeSet;

import java.util.TreeSet;

public class Challenge_1 {
    public static void main(String[] args) {

        TreeSet<String> zooAnimal = new TreeSet<>();
        zooAnimal.add("Turtle");
        zooAnimal.add("Elephant");
        zooAnimal.add("Kangaroo");
        zooAnimal.add("Zebra");
        zooAnimal.add("Emu");
        zooAnimal.add("Bison");

        System.out.println(zooAnimal);
    }
}