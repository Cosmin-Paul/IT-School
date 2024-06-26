package session_6_core_apis.challenges;

import java.util.*;

public class challenge_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase to later remove all vowels: ");
        String input = scanner.nextLine();
        String result = vowelRemover(input);
        System.out.println("Result after removing vowels: " + result);
        scanner.close();
    }

    public static String vowelRemover(String string) {
        StringBuilder sb = new StringBuilder();
        String lowCase = string.toLowerCase();
        for (int index = 0; index < string.length(); index++) {
            char ch = lowCase.charAt(index);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(string.charAt(index));
            }
        }
        return sb.toString();
    }
}