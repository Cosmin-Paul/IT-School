package session_3_java_operators.challenges;
import java.util.Scanner;
public class ch3_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("add an integer to be inverted: ");
        int number = scanner.nextInt();

        int invers = -number;
        System.out.println("The revers sign of: " + number + " is: " + invers);


    }
}
