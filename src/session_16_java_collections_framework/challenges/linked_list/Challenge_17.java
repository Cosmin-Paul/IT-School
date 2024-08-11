package session_16_java_collections_framework.challenges.linked_list;

import java.util.LinkedList;

public class Challenge_17 {
    public static void main(String[] args) {

        LinkedList<String> fastFood1 = new LinkedList<>();

        fastFood1.add("Pizza");
        fastFood1.add("Shaorma");
        fastFood1.add("Souvlaki");
        fastFood1.add("Burger");
        fastFood1.add("Spagetti");
        fastFood1.add("Hot Wings");
        fastFood1.add("Barbecue");

        System.out.println("List 1 of fast food meals is: " + fastFood1);

        LinkedList<String> fastFood2 = new LinkedList<>();
        fastFood2.add("Caesar salad");
        fastFood2.add("Tacos");
        fastFood2.add("Burrito");
        fastFood2.add("Chilli con carne");

        System.out.println("List 2 of fast food meals is:" + fastFood2);

        LinkedList<String> joinedFood = new LinkedList<>();
        joinedFood.addAll(fastFood1);
        joinedFood.addAll(fastFood2);

        System.out.println("The full list" + joinedFood);
    }
}