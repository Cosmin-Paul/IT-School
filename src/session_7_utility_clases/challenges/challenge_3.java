package session_7_utility_clases.challenges;

import java.time.LocalDate;

public class challenge_3 {

    public static LocalDate createSpecificDate() {
        LocalDate specificDate = LocalDate.of(2025, 8, 19);
        return specificDate;
    }

    public static void main(String[] args) {
        LocalDate date = createSpecificDate();
        System.out.println("The specific date is: " + date);
    }
}

