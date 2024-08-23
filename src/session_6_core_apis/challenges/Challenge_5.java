package session_6_core_apis.challenges;

public class Challenge_5 {
    public static void main(String[] args) {
        String input = " car,train, metro,bus";

        StringBuilder sb = new StringBuilder();
        boolean firstWord = true;
        for (int i = 0; i < input.length(); i++) {
            char myChar = input.charAt(i);

            if (Character.isWhitespace(myChar)) {
                sb.append(myChar);

                firstWord = true;
            } else if (firstWord) {
                sb.append(Character.toUpperCase(myChar));
                firstWord = false;
            }
            else {
                sb.append(Character.toLowerCase(myChar));
            }
        }
        System.out.println("Words Capitalized: " + sb);
    }
}