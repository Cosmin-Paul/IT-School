package session_6_core_apis.challenges;

import java.util.*;

public class Challenge_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringsList = new ArrayList<>();
        stringsList.add(" This ");
        stringsList.add(" is ");
        stringsList.add(" a ");
        stringsList.add(" crazy ");
        stringsList.add(" super session_18.challenge! ");

        String concatenatedStrings = concateStrings(stringsList);

        System.out.println(concatenatedStrings);
    }

    public static String concateStrings(List<String> strings) {
        StringBuilder sb = new StringBuilder();
        for (String x : strings) {
            sb.append(x);
        }
        return sb.toString();
    }
}
