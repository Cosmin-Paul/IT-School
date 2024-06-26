package session_4_java_operators_and_loops.challenges;

import java.util.Scanner;

public class challenge_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student's score: ");
        double score = sc.nextDouble();

        char grades = (score >= 90) ? 'A' :
                (score >= 80) ? 'B' :
                        (score >= 70) ? 'C' :
                                (score >= 60) ? 'D' : 'F';
        System.out.println("The final grade is: " + grades);
    }
}