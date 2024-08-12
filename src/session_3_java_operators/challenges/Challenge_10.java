package session_3_java_operators.challenges;

import java.util.Scanner;

public class Challenge_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to be inverted: ");

        int number = scanner.nextInt();
        int reversNumber = -number;
        System.out.println("The revers sign of: " + number + " is: " + reversNumber);
    }
}