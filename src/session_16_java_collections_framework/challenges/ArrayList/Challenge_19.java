package session_16_java_collections_framework.challenges.ArrayList;

import java.util.ArrayList;

public class Challenge_19 {
    public static void main(String[] args) {
        ArrayList<String> gardeningTools = new ArrayList<>();
        gardeningTools.add("Shovel");
        gardeningTools.add("Grass cutter");
        gardeningTools.add("Grass scissor");
        gardeningTools.add("watering system");
        gardeningTools.add("Hand trowel");
        gardeningTools.add("Hand fork");
        gardeningTools.add("Rake");
        gardeningTools.add("Hand gloves");
        gardeningTools.add("Digging fork");
        gardeningTools.add("Eye glasses");

        System.out.println("The initial capacity list is: " + gardeningTools.size());

        gardeningTools.trimToSize();

        System.out.println("The capacity after trimming is: " + gardeningTools.size());
    }
}