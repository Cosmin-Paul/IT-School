package session_6_core_apis.challenges;

import java.util.Scanner;

public class challenge_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some words");

        String inputString = scanner.nextLine();
        boolean isPalindrome = isPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("Is a Palindrome string");
        } else {
            System.out.println("Is not a Palindrome string");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String palindromeString) {
        StringBuilder sb = new StringBuilder(palindromeString);
        String reverse = sb.reverse().toString();

        return palindromeString.equals(reverse);
    }
}