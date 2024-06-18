package session_3_java_operators.challenges;

import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find out if it's positive or negative: ");
        double numInput = scanner.nextDouble();

        if (numInput > 0) {
            System.out.println(numInput + " is positive");}
        else if (numInput == 0) {
            System.out.println(numInput + " is zero");}
        else {
            System.out.println(numInput + " is negative");}
        }
        }