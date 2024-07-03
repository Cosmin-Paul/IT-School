package session_7_utility_clases.challenges;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Challenge_8 {
    public static void main(String[] args) {
        String randomDay = "2024-06-01";
        String dayOfWeek = findDayOfWeek(randomDay);
        System.out.println("The day of week for " + randomDay + " is: " + dayOfWeek);
    }

    private static String findDayOfWeek(String randomDay) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
        LocalDate date = LocalDate.parse(randomDay, formatter);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.toString();
    }
}