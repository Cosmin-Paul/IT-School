package session_5_java_advanced_flow_control.challenges;

import java.util.Scanner;

public class challenge_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.println("Please enter a few numbers to sum them and -1 to stop: ");
            number = scanner.nextInt();

            if (number != -1) {
                sum += number;
            }
        }
        while (number != -1);
        System.out.println("The total sum numbers you entered without -1 is: " + sum);
    }
}