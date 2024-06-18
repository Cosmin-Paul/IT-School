package session_3_java_operators.challenges;
import java.util.Scanner;
public class Challenge_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lungime: ");
        int lungime = scanner.nextInt();

        System.out.println("latime: ");
        int latime = scanner.nextInt();

        int aria = lungime * latime;
        System.out.println("Aria dreptughiului este: " + aria);

    }
}
