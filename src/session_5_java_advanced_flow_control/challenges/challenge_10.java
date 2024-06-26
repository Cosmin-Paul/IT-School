package session_5_java_advanced_flow_control.challenges;

import java.util.Scanner;

public class challenge_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: Print Hello World");
            System.out.println("2: Print user's name");
            System.out.println("3: Exit menu");
            System.out.println("Please select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.print("Your name");
                    String yourName = scanner.nextLine();
                    break;
                case 3:
                    System.out.println("See you verry soon!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number ");
                    continue;
            }
            scanner.nextLine();
            System.out.println();
        }
    }
}