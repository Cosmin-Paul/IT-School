package session_5_java_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        fibonacci(n);
    }
    public static void fibonacci(int n) {

        if (n > 0) {
            System.out.println("Enter a number greater then 0");

            int x = 0;
            int y = 1;

            for (int i = 1; i <= n; i++) {
                System.out.println(x + " ");
                int sum = x + y;
                x = y;
                y = sum;
            }
        }
    }
}