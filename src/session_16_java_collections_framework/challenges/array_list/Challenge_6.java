package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;

public class Challenge_6 {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();
        carList.add("Opel");
        carList.add("Dacia");
        carList.add("Ford");
        carList.add("Mazda");
        carList.add("Bmw");
        carList.add("Kia");

        System.out.println("The original list is: " + carList);

        carList.remove(2);

        System.out.println(carList);
    }
}