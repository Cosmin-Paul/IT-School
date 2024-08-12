package session_3_java_operators.challenges;
import java.util.Scanner;
public class Challenge_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please an integer between 1 and 100: ");
        int userNumber = scanner.nextInt();

        if (userNumber >= 1 && userNumber <= 100) {
            System.out.println("The number " + userNumber + " is within the range of " + 1 + " to " + 100);
        }
        else {
            System.out.println("The number " + userNumber + " is outside the range of " + 1 + " to " + 100);
        }
    }
}