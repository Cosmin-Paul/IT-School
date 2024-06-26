package session_5_java_advanced_flow_control.challenges;

public class challenge_3 {
    public static void main(String[] args) {

        int[] arrayList = {1, 25, -7, 9, -31, 16, -12, -24, 48, 94};
        negativeNumbers(arrayList);
    }
    public static void negativeNumbers(int[] arrayList) {

        int negativeNumbers = 0;

        for (int a = 0; a < arrayList.length; a++) {
            if (arrayList[a] < 0) {
                negativeNumbers++;
            }
        }
        System.out.println("The total negative numbers is: " + negativeNumbers);
    }
}