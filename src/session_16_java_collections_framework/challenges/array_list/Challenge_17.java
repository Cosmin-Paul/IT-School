package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;

public class Challenge_17 {
    public static void main(String[] args) {
        ArrayList<String> farmAnimal = new ArrayList<>();
        farmAnimal.add("Sheep");
        farmAnimal.add("Goat");
        farmAnimal.add("Cow");
        farmAnimal.add("Horse");
        farmAnimal.add("Duck");
        farmAnimal.add("Turkey");
        farmAnimal.add("Goose");
        farmAnimal.add("Pig");

        System.out.println("The original list of my farm animals is: " + farmAnimal);
        farmAnimal.clear();

        System.out.println("The list of animals  after  we use the clear method is: " + farmAnimal);
    }
}