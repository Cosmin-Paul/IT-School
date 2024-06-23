package session_5_java_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please an integer");

        int num = sc.nextInt();

        if (num % 2 == 0 ) {
            System.out.println("This number is Even");
        }
        else {
            System.out.println("This number is Odd");
        }

    }
}
