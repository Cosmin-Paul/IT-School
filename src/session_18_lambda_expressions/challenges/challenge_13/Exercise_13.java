package session_18_lambda_expressions.challenges.challenge_13;

public class Exercise_13 {
    public static double valueDouble(double value, SingleDouble single) {
        return single.parameter(value);
    }

    public static void main(String[] args) {
        SingleDouble singleDouble = (value -> Math.sqrt(value));
        double result = valueDouble(12, singleDouble);

        System.out.println(result);
    }
}