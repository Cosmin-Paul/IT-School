package session_16_java_collections_framework.challenges.HashSet;

import java.util.HashSet;

public class Challenge_5 {
    public static void main(String[] args) {
        HashSet<String> zooAnimal = new HashSet<>();

        zooAnimal.add("Snake");
        zooAnimal.add("Monkey");
        zooAnimal.add("Llama");
        zooAnimal.add("Kangaroo");
        zooAnimal.add("Bizon");
        zooAnimal.add("Panda bear");
        zooAnimal.add("Parrot");

        if (zooAnimal.isEmpty()) {
            System.out.println("This HashSet is empty");
        } else {
            System.out.println("This HashSet is not empty");
        }
        zooAnimal.clear();

        if (zooAnimal.isEmpty()) {
            System.out.println("The HashSet is empty now");
        }
    }
}