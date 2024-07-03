package session_3_java_operators.challenges;

import java.util.Scanner;

public class Challenge_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value byte");
        byte byte1 = scanner.nextByte();
        System.out.println("Enter the secont value byte");

        byte byte2 = scanner.nextByte();
        byte bytesum = (byte) (byte1 + byte2);
        System.out.println("The result of addition is:" + bytesum);
    }
}
