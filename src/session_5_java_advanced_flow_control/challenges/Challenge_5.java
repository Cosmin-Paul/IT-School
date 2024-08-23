package session_5_java_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number > 5 : ");
        int n = scanner.nextInt();

        System.out.println("The first n numbers of the Fibonacci series are: ");

        fibonacci(n);
    }

    public static void fibonacci(int n) {

        if (n > 0) {
            int x = 1;
            int y = 2;

            for (int i = 1; i <= n; i++) {
                System.out.println(x + " ");
                int sum = x + y;
                x = y;
                y = sum;
            }
        }
    }
}