package session_3_java_operators.challenges;

import java.util.Scanner;

public class Challenge_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the original price");
        double priceoriginal = scanner.nextDouble();
        System.out.println("Enter the discount percentage");
        double discountPercentage = scanner.nextDouble();

        double priceDiscounted = priceoriginal - priceoriginal * discountPercentage / 100;
        System.out.println("The final price after discount is: " + priceDiscounted);
    }
}