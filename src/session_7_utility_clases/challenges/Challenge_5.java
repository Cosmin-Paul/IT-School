package session_7_utility_clases.challenges;

import java.time.LocalDate;

public class Challenge_5 {
    public static void main(String[] args) {

        boolean value = isTodaySpecificDate();
        System.out.println(value);
    }

    private static boolean isTodaySpecificDate() {
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2019,12,10);
        return today.equals(specificDate);

    }
}
