package session_3_java_operators.practice;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first value: ");
        int x = scanner.nextInt();

        System.out.println("enter the second value");
        int y = scanner.nextInt();
        int reminder = x % y;

        double power = Math.pow(x, y);
        System.out.println("Reminder:" + reminder);
        System.out.println("Power:" + power);
    }
}
