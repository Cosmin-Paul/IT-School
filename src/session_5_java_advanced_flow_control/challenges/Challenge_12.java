package session_5_java_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        for (int x = 0; x < 10; x++) {
            System.out.println("Enter 10 numbers" + ": ");
            double number = scanner.nextDouble();
            if (number <= 5) {
                continue;
            }
            sum += number;
            System.out.println(" The sum of numbers greater then 5: " + sum);
        }
    }
}