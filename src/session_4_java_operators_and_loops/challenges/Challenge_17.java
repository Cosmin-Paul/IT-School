package session_4_java_operators_and_loops.challenges;

import java.util.Scanner;

public class Challenge_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the username: ");

        boolean hasUsername = scanner.nextBoolean();
        System.out.println("Please enter your password: ");
        boolean hasPassword = scanner.nextBoolean();

        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");

        } else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        } else {
            System.out.println("Authentication failed");
        }
    }
}