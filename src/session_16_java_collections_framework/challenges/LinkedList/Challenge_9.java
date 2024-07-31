package session_16_java_collections_framework.challenges.LinkedList;

import java.util.LinkedList;

public class Challenge_9 {
    public static void main(String[] args) {
        LinkedList<String> zooAnimal = new LinkedList<>();
        zooAnimal.add("Tiger");
        zooAnimal.add("Koala");
        zooAnimal.add("Zebra");
        zooAnimal.add("Gorilla");
        zooAnimal.add("Turtle");

        int position1 = 0;
        String element1 = "Giraffe";
        int position2 = 2;
        String element2 = "Panda";
        int position3 = 5;
        String element3 = "Parrot";
        int position4 = 7;
        String element4 = "Mandarin duck";

        zooAnimal.add(0, "Giraffe");
        zooAnimal.add(2, "Panda");
        zooAnimal.add(5, "Parrot");
        zooAnimal.add(7, "Mandarin duck");

        System.out.println(zooAnimal);
    }
}