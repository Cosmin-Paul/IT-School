package session_4_java_operators_and_loops.challenges;

public class Challenge_17 {
    public static void main(String[] args) {

        boolean Username = true;
        boolean Password = true;

        if (Username && Password) {
            System.out.println("Authentication successful");
        } else if (!Username || !Password) {
            System.out.println("Authentication failed");
        } else if (Username && !Password) {
            System.out.println("Password is incorrect");
        }

    }
}