package session_9_arrays.challenges;

import java.util.ArrayList;
import java.util.Scanner;


public class Challenge_5 {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("Barcelona");
        cityList.add("Madrid");
        cityList.add("Verona");
        cityList.add("Vienna");
        cityList.add("Lefkada");

        System.out.println("Initial list of cities is: " + cityList);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a city name to add them to list: ");
        String newCity = scanner.nextLine();

        if (cityList.contains(newCity)) {
            System.out.println(newCity + "  " + "It's a duplicate.");
        } else {
            cityList.add(newCity);
        }

        System.out.println("Final list of cities: " + cityList);

        scanner.close();
    }
}
