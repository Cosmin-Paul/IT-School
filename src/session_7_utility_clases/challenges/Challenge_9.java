package session_7_utility_clases.challenges;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Challenge_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first date like this: 'YYYY-MM-DD'");
        String dateStr1 = scanner.nextLine();

        System.out.println("Please enter the second date like this: 'YYYY-MM-DD'");
        String dateStr2 = scanner.nextLine();

        double daysBetween = daysBetween(dateStr1, dateStr2);
        System.out.println("The number of days between " + dateStr1 + " and " + dateStr2 + " is: " + daysBetween);
    }

    private static double daysBetween(String dateStr1, String dateStr2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate firstDate = LocalDate.parse(dateStr1, formatter);
        LocalDate secondDate = LocalDate.parse(dateStr2, formatter);

        return ChronoUnit.DAYS.between(firstDate, secondDate);
    }
}