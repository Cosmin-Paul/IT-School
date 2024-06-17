package session_4_java_operators_and_loops.challenges;

public class ch4_16 {
    public static void main(String[] args) {

        int number = 50;
        System.out.println("The initial value of number is: " + number);

        int negatedNumber = -number;
        System.out.println("The value of number after negation is: " + negatedNumber);

        int absoluteValue = Math.abs(number);
        System.out.println("The absolute value is: " + absoluteValue);

        int incrementedValue = ++absoluteValue;
        System.out.println("The incremented value result is: " + incrementedValue);
    }
}
