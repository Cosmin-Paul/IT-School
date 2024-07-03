package session_4_java_operators_and_loops.challenges;

import java.util.Scanner;

public class Challenge_20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.println("Please enter the second number (b): ");
        int b = scanner.nextInt();

        System.out.println("Please enter the third number (c): ");
        int c = scanner.nextInt();
        int largestNumber = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The largest number is: " + largest);
        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("The smallest number is: " + smallest);
    }
}