package session_18_lambda_expressions.practice;

public class intSumPractice {
    public static void main(String[] args) {
        IntSum result = (a, b) -> a + b;
        System.out.println(result.sum(2, 9));
    }
}