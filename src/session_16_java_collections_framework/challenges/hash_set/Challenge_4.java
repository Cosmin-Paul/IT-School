package session_16_java_collections_framework.challenges.hash_set;

import java.util.HashSet;

public class Challenge_4 {
    public static void main(String[] args) {
        HashSet<String> zooAnimal = new HashSet<>();

        zooAnimal.add("Snake");
        zooAnimal.add("Monkey");
        zooAnimal.add("Llama");
        zooAnimal.add("Kangaroo");
        zooAnimal.add("Bizon");
        zooAnimal.add("Panda bear");
        zooAnimal.add("Parrot");

        System.out.println("This is the original HashSet: " + zooAnimal);

        zooAnimal.clear();

        System.out.println("The HashSet after clearing is: " + zooAnimal);
    }
}