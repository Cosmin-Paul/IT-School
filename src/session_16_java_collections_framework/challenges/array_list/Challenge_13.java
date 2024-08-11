package session_16_java_collections_framework.challenges.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge_13 {
    public static void main(String[] args) {

        //var 1
        List<String> list1 = new ArrayList<>();
        list1.add("Yellow");
        list1.add("Indigo");
        list1.add("Lila");
        list1.add("Blue");


        List<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Yellow");
        list2.add("Corail");
        list2.add("Magenta");
        list2.add("Orange");
        list2.add("Blue");

        boolean isEqual = list1.equals(list2);

        System.out.println("Are equals list 1 and list 2? " + isEqual);

        //var 2

        List<String> list3 = new ArrayList<>();
        list3.add("Plain");
        list3.add("Boat");
        list3.add("Canoe");
        list3.add("Train");
        list3.add("Truck");

        List<String> list4 = new ArrayList<>();
        list3.add("Plain");
        list3.add("Boat");
        list3.add("Canoe");
        list3.add("Train");
        list3.add("Truck");

        boolean areEquals1 = list3.equals(list4);
        boolean areEquals2 = list3 == list4;

        System.out.println("Are equals list 3 and list 4? " + areEquals1);
        System.out.println("Are equals list 3 and list 4? " + areEquals2);
    }
}