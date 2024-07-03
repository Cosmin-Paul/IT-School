package session_7_utility_clases.challenges;

import java.time.LocalDate;

public class Challenge_7 {
    public static void main(String[] args) {
        int weeksToAdd = 4;
        LocalDate newDate = addWeeksToToday(weeksToAdd);
        System.out.println("The new date after adding " + weeksToAdd + " weeks: " + newDate);
    }

    private static LocalDate addWeeksToToday(int weeks) {
        LocalDate todayDate = LocalDate.now();
        LocalDate finalDate = todayDate.plusWeeks(weeks);

        return finalDate;
    }
}