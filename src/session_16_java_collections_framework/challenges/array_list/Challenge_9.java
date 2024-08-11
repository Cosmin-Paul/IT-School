package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;

public class Challenge_9 {
    public static void main(String[] args) {
        ArrayList<String> cityList1 = new ArrayList<>();
        cityList1.add("Barcelona");
        cityList1.add("Verona");
        cityList1.add("Madrid");
        cityList1.add("Malaga");
        cityList1.add("Skyathos");
        cityList1.add("Napoli");

        ArrayList<String> cityList2 = new ArrayList<>(cityList1.size());
        cityList2.addAll(cityList1);

        System.out.println("The original list is: " + cityList1);
        System.out.println("The copied list is: " + cityList2);
    }
}