package session_16_java_collections_framework.challenges.linked_list;

import java.util.LinkedList;

public class Challenge_11 {
    public static void main(String[] args) {
        LinkedList<String> roadTripp = new LinkedList<>();
        roadTripp.add("Palma de Mallorca");
        roadTripp.add("Ibiza");
        roadTripp.add("Guadalajara");
        roadTripp.add("Santa Monica");
        roadTripp.add("Acapulco");
        roadTripp.add("Puerto de Valencia");
        roadTripp.add("Santa Cruz");
        roadTripp.add("Veracruz");

        System.out.println("The position of elements are: ");

        for (int i = 0; i < roadTripp.size(); i++) {
            System.out.println("Position " + i + ": " + roadTripp.get(i));
        }
    }
}