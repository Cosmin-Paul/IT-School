package session_5_java_advanced_flow_control.challenges;

import java.util.Scanner;

public class challenge_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string: ");

        String inputString = scanner.nextLine();
        scanner.close();

        String reversedString = new StringBuffer(inputString).reverse().toString();
        System.out.println("The reversed version of this string is: " + reversedString);
    }
}