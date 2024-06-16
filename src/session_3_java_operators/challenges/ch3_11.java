package session_3_java_operators.challenges;

import java.util.Scanner;

public class ch3_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a boolean value to be negated: ");
        boolean a = scanner.nextBoolean();

        System.out.println("Enter a second boolean value to be negated: ");
        boolean b = scanner.nextBoolean();

        boolean aNegativ = !a;
        boolean bNegativ = !b;
        System.out.println("Your Negated booleans are: " + aNegativ + "," + bNegativ);


    }
}
