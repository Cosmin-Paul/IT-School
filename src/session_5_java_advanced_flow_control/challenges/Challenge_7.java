package session_5_java_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number: ");
        int predefinedNumber = 17;
        int guessNumber;
        do {
            guessNumber = scanner.nextInt();
            if (guessNumber > predefinedNumber) {
                System.out.println("This number is to high! Try again!");
            } else if (guessNumber < predefinedNumber) {
                System.out.println("This number is to low! Try again!");
            } else {
                System.out.println("Congrats! you have guessed the lucky number!");
            }
        }
        while (guessNumber != predefinedNumber);
        scanner.close();
    }
}