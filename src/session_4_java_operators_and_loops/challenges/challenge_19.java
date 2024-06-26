package session_4_java_operators_and_loops.challenges;

import java.util.Scanner;

public class challenge_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age");
        int age = scanner.nextInt();

        String agesClasification = (age < 12) ? " You are a Child" : (age >= 12 && age <= 17) ? "You are a Teenager"
                : (age >= 18 && age <= 64) ? "You are an Adult" : "Senior";

        System.out.println("The agesClasification" + agesClasification);
    }
}