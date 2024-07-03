package session_3_java_operators.challenges;

import java.util.Scanner;

public class Challenge_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to be negated: ");
        boolean a = scanner.nextBoolean();

        System.out.println("Enter a second value to be negated: ");
        boolean b = scanner.nextBoolean();

        boolean aNegativ = !a;
        boolean bNegativ = !b;
        System.out.println("Your negated boolean values are: " + aNegativ + " , " + bNegativ);


    }
}
