package session_7_utility_clases.challenges;

import java.time.LocalDate;

public class Challenge_2 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024, 06, 30);
        displayDateComponents(date);
    }

    private static void displayDateComponents(LocalDate date) {
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}