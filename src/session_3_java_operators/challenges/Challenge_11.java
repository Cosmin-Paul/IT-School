package session_3_java_operators.challenges;

import java.util.Scanner;

public class Challenge_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a boolean value to be negated: ");
        boolean firstValue = sc.nextBoolean();

        System.out.println("Enter a second boolean value to be negated: ");
        boolean secondValue = sc.nextBoolean();

        sc.close();

        boolean aNegative = !firstValue;
        boolean bNegative = !secondValue;
        System.out.println("Your negated boolean values are: " + aNegative + " , " + bNegative);
    }
}