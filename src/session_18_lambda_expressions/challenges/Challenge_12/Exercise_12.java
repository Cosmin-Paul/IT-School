package session_18_lambda_expressions.challenges.Challenge_12;

public class Exercise_12 {
    public static String twoStrings(String str1, String str2, ConcatenatedString concatString) {
        return concatString.concateString(str1, str2);
    }

    public static void main(String[] args) {
        ConcatenatedString newString = ((str1, str2) -> str1 + " " + str2);

        String result = twoStrings("Welcome", "in America!", newString);
        System.out.println(result);
    }
}