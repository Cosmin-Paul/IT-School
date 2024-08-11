package session_16_java_collections_framework.challenges.linked_list;

import java.util.LinkedList;

public class Challenge_1 {
    public static void main(String[] args) {
        LinkedList<String> toyStore = new LinkedList<>();

        toyStore.add("Car");
        toyStore.add("Truck");
        toyStore.add("Barbie");
        toyStore.add("Dinosaur");
        toyStore.add("Ballerina");
        toyStore.add("Basket Ball");
        toyStore.add("Old train");
        toyStore.add("Carnival mask");
        toyStore.add("Unicorn");
        toyStore.add("Doll house");
        toyStore.add("Skates");
        toyStore.add("Bike");
        toyStore.add("Makeup table");

        toyStore.add("Sailboat");
        System.out.println("The list with the new element added after is: " + toyStore);
    }
}