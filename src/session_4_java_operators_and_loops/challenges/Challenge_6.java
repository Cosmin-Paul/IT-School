package session_4_java_operators_and_loops.challenges;

import java.util.*;

public class Challenge_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the temperature to compare it ");

        int temperature = scanner.nextInt();

        if (temperature > 30) {
            System.out.println(" It's hot ");
        } else if (temperature > +20 && temperature <= 30) {
            System.out.println(" It's warm ");
        } else {
            System.out.println(" It's cold");
        }
    }
}
