package session_3_java_operators.practice;

public class variables {
    public static void main(String[] args) {
        int age; //declaration
        age = 27; //initialization

        int value  = 10; //declaration and initialization

        int outerVariable = 100;
        if(outerVariable > 50) {
            int innerVariable = 200;
            System.out.println(innerVariable + outerVariable);
        }
    }
}
