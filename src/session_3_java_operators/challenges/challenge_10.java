package session_3_java_operators.challenges;

import java.util.Scanner;

public class challenge_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("add an integer to be inverted: ");
        int number = scanner.nextInt();
        int revers = -number;
        System.out.println("The revers sign of: " + number + " is: " + revers);
    }
}