package session_5_java_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int inputNumbers = 10;

        System.out.println("Enter 10 numbers");

        for (int x = 0; x < 10; x++) {
            double input = scanner.nextDouble();

            if (inputNumbers <= 5) {
                continue;
            }
            sum += input;
            System.out.println(" The sum of numbers > 5: " + sum);
        }
    }
}