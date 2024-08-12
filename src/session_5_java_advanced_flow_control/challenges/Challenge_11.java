package session_5_java_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter a number and later 0 to stop: ");
            int number = scanner.nextInt();

            if (number != 0) {
                count++;
                sum += number;

            } else {
                break;
            }
            double average = sum / count;
            System.out.println("The average of numbers is: " + average);
        }
        scanner.close();
    }
}