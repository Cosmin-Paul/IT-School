package session_4_java_operators_and_loops.challenges;

public class challenge_1 {
    public static void main(String[] args) {

        String string1 = "OpenAI";
        String string2 = "OpenAI";

        boolean areSameObject1 = (string1 == string2);
        boolean areSameObject2 = (string1.equals(string2));

        System.out.println("string1 and string2 point to the same object? : " + areSameObject1);
        System.out.println("string1 and string2 point to the same object ? : " + areSameObject2);
    }
}