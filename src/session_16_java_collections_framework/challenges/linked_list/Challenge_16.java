package session_16_java_collections_framework.challenges.linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class Challenge_16 {
    public static void main(String[] args) {
        LinkedList<String> carBox = new LinkedList<>();

        carBox.add("Opel");
        carBox.add("Audi");
        carBox.add("Volkswagen");
        carBox.add("Toyota");
        carBox.add("Seat");
        carBox.add("Cupra");
        carBox.add("Fiat");

        System.out.println("Original car list is: " + carBox);

        Collections.shuffle(carBox);
        System.out.println("List after shuffled items is: " + carBox);
    }
}