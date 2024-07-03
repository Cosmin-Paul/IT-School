package session_4_java_operators_and_loops.challenges;

public class Challenge_8 {
    public static void main(String[] args) {

        int number = 8;
        int factorial = 3;

        for (int x = 1; x <= number; x++) {
            factorial *= x;

            System.out.println("The factorial of" + number + " is " + factorial);
        }
    }
}