package session_7_utility_clases.challenges;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class challenge_6 {
    public static void main(String[] args) {
        displayCurrentTime();
    }

    private static void displayCurrentTime() {
        LocalTime currentTyme = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String actualTime = currentTyme.format(formatter);

        System.out.println("In my city, the time wright now is: " + actualTime);
    }
}
