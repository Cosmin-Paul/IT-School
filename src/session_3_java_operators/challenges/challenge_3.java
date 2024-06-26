package session_3_java_operators.challenges;

import java.util.Scanner;

public class challenge_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find out if it's positive or negative: ");
        double numInput = scanner.nextDouble();

        if (numInput > 0) {
            System.out.println(numInput + " This number is positive");
        } else if (numInput == 0) {
            System.out.println(numInput + " This number is zero");
        } else {
            System.out.println(numInput + " This number is negative");
        }
    }
}