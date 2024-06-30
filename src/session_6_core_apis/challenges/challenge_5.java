package session_6_core_apis.challenges;

public class challenge_5 {
    public static void main(String[] args) {
        String input =  " car,train, metro,bus,airplane,yacht,canoe,sailboat,dirijable,deltaplane";
        String[] inputArray = input.split(",");

        StringBuilder sb = new StringBuilder();
        for (String value : inputArray ) {
            sb.append(Character.toUpperCase(value.charAt(0)))
            .append(value.substring(1))
                    .append("\n");

            System.out.print(sb);


        }

    }
}
