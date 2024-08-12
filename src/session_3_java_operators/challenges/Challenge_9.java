package session_3_java_operators.challenges;

import java.util.Scanner;

public class Challenge_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the length: ");
        int length = scanner.nextInt();

        System.out.println("Enter the width: ");
        int width = scanner.nextInt();
        int rectangleArea = length * width;
        System.out.println("The area of the rectangle is: " + rectangleArea);
    }
}