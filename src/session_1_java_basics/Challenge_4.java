package session_1_java_basics;

import java.util.Scanner;

public class Challenge_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first name: ");
        double num1 = scanner.nextDouble();

        System.out.println("Please enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double modulus = num1 % num2;

        System.out.println("The sum of those numbers is: " + sum);
        System.out.println("The product of those numbers is: " + multiplication);
        System.out.println("The difference of those numbers is: " + difference);
        System.out.println("The division of those numbers is: " + division);
        System.out.println("The modulus of those numbers is: " + modulus);

    }
}
