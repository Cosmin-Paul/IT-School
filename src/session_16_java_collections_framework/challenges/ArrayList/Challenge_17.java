package session_16_java_collections_framework.challenges.ArrayList;

import java.util.ArrayList;

public class Challenge_17 {
    public static void main(String[] args) {
        ArrayList<String> farmAnimal = new ArrayList<>();
        farmAnimal.add("Sheep");
        farmAnimal.add("Goat");
        farmAnimal.add("Lamb");
        farmAnimal.add("Cow");
        farmAnimal.add("Horse");
        farmAnimal.add("Donkey");
        farmAnimal.add("Duck");
        farmAnimal.add("Turkey");
        farmAnimal.add("Goose");
        farmAnimal.add("Pig");
        farmAnimal.add("Rabbit");
        farmAnimal.add("Rooster");
        farmAnimal.add("Rooster");
        farmAnimal.add("Chicken");
        farmAnimal.add("Ox");
        farmAnimal.add("German sheppard");

        System.out.println("The original list of my farm animals is: " + farmAnimal);
        farmAnimal.clear();

        System.out.println("The list of animals  after  we use the clear method is: " + farmAnimal);
    }
}