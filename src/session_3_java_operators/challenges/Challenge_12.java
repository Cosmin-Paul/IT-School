package session_3_java_operators.challenges;

import java.util.Scanner;

public class Challenge_12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an number:");
        int numberInteger = scanner.nextInt();

        numberInteger++;
        System.out.println("The value of number incremented are:" + numberInteger);

        numberInteger--;
        System.out.println("The value of number decremented are:" + numberInteger);
    }
}