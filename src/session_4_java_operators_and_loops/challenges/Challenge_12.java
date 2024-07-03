package session_4_java_operators_and_loops.challenges;

import java.util.*;

public class Challenge_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please a positive number to negate it: ");

        int x = scanner.nextInt();
        int negativeNumber = -x;

        System.out.println("The original number is: " + x);
        System.out.println("The negative number is: " + negativeNumber);
    }
}