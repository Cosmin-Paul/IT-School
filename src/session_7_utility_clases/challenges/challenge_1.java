package session_7_utility_clases.challenges;

import java.time.LocalDate;

public class challenge_1 {
    public static void main(String[] args) {
        displayTodayDate();
    }

    private static void displayTodayDate() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
}
