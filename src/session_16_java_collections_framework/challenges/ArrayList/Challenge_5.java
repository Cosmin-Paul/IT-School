package session_16_java_collections_framework.challenges.ArrayList;

import java.util.ArrayList;

public class Challenge_5 {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();
        carList.add("Opel");
        carList.add("Dacia");
        carList.add("Ford");
        carList.add("Mazda");
        carList.add("Bmw");
        carList.add("Kia");

        int i = 5;

        String givenElement = "Volvo";
        carList.set(5, givenElement);

        System.out.println(carList);
    }
}