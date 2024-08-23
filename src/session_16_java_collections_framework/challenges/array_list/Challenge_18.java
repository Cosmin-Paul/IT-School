package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;

public class Challenge_18 {
    public static void main(String[] args) {

        ArrayList<String> myFarm = new ArrayList<>();
        myFarm.add("Principale mansion");
        myFarm.add("Secondary mansion cottage");
        myFarm.add("Barn");
        myFarm.add("Animal yard");
        myFarm.add("Silo");
        myFarm.add("Grass");
        myFarm.add("Tractor");
        myFarm.add("Water pump");
        myFarm.add("Hay bales");
        myFarm.add("Gardening tools");

        System.out.println("My initial farm list contains: " + myFarm);

        if (myFarm.isEmpty()) {
            System.out.println("This farm stuff is empty");
        } else {
            System.out.println("This farm list is not empty");
        }
    }
}