package session_5_java_advanced_flow_control.challenges;

public class Challenge_9 {
    public static void main(String[] args) {
        int[] arrayList = {1, 7, 9, 14, 28, 36, 43, 57, 60, 68, 75};

        for (int number : arrayList) {

            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }
        }
    }
}