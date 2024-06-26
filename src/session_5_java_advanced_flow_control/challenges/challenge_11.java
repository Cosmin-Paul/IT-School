package session_5_java_advanced_flow_control.challenges;

import java.util.Scanner;

public class challenge_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        int count = 0;
        int total = 0;
        while (number > 0) {
            count++;
            total = total + number;
            number = scanner.nextInt();
        }
        int average = total / count;
        System.out.println(average);
        scanner.close();
    }
}
