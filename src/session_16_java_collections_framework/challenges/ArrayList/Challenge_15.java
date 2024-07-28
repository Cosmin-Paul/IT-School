package session_16_java_collections_framework.challenges.ArrayList;

import java.util.ArrayList;

public class Challenge_15 {
    public static void main(String[] args) {
        ArrayList<String> travelDestination1 = new ArrayList<>();
        travelDestination1.add("Palma de Mallorca");
        travelDestination1.add("Barcelona");
        travelDestination1.add("Ciudad Del Cruz");
        travelDestination1.add("Thailand");
        travelDestination1.add("Verona");

        System.out.println("The travel destination1 are: " + travelDestination1);

        ArrayList<String> travelDestination2 = new ArrayList<>();
        travelDestination2.add("Sydney Australia");
        travelDestination2.add("Yukatan Mexico");
        travelDestination2.add("Madagascar");
        travelDestination2.add("Paris");
        travelDestination2.add("Cancun");

        System.out.println("The travel destination2 are:" + travelDestination2);

        ArrayList<String> joinedList = new ArrayList<>();
        joinedList.addAll(travelDestination1);
        joinedList.addAll(travelDestination2);

        System.out.println("The joined list of destinations are: " + joinedList);
    }
}