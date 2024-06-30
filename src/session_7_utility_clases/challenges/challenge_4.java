package session_7_utility_clases.challenges;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class challenge_4 {
    public static void main(String[] args) {
        boolean value = areDatesEqual();
        System.out.println("Are equal thous calendar dates? " + value);
    }

    public static boolean areDatesEqual() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first date: 'YYYY-MM-DD'");

        String dateStr1 = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(dateStr1, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("Please enter the second date: 'YYYY-MM-DD'");
        String dataStr2 = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(dataStr2, DateTimeFormatter.ISO_LOCAL_DATE);

        return firstDate.equals(secondDate);
    }
}