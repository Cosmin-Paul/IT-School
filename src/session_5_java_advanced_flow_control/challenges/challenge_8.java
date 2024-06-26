package session_5_java_advanced_flow_control.challenges;

public class challenge_8 {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " ");
            int sum = x + y;
            x = y;
            y = sum;
        }
    }
}