package session_6_core_apis.challenges;

import java.util.Scanner;

public class challenge_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");

        String inputString = sc.nextLine();
        StringBuilder sb = new StringBuilder(inputString);
        String stringReversed = sb.reverse().toString();

        System.out.println("Your reversed name is: " + stringReversed);

        sc.close();
    }
}