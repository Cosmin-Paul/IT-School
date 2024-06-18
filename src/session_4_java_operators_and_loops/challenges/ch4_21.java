package session_4_java_operators_and_loops.challenges;

import java.util.Scanner;

public class ch4_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please the score: ");
        double score = scanner.nextDouble();

        String grades = (score >= 90 && score <= 100) ? "A" :
                (score >= 80 && score < 90) ? "B" :
                (score >= 70 && score < 80) ? "C" :
                (score >= 60 && score < 70) ? "D" : "F";

        System.out.println("The grade letter is: " + grades);


    }
}
