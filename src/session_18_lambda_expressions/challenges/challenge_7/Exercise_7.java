package session_18_lambda_expressions.challenges.challenge_7;

public class Exercise_7 {
    public static void main(String[] args) {

        IntString intString = (str, n) -> str.length() <= n ? str : str.substring(0, n);

        String str1 = "Hello people, nice to meet you !";
        int n1 = 10;

        String result1 = intString.combine(str1, n1);
        System.out.println("The partial string is: " + result1);

        String str2 = "People like's JDK!";
        int n2 = 5;

        String result2 = intString.combine(str2, n2);
        System.out.println("The partial string is: " + result2);
    }
}