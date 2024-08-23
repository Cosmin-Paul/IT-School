package session_6_core_apis.challenges;

import java.util.Scanner;

public class Challenge_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");

        String inputString = scanner.nextLine();
        boolean isPalindrome = isPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("Is a Palindrome word");
        } else {
            System.out.println("Is not a Palindrome word");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String palindromeString) {
        StringBuilder sb = new StringBuilder(palindromeString);
        String reverse = sb.reverse().toString();

        return palindromeString.equals(reverse);
    }
}