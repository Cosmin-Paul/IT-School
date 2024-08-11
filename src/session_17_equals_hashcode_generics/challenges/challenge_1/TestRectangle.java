package session_17_equals_hashcode_generics.challenges.challenge_1;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle test1 = new Rectangle(20, 60);
        Rectangle test2 = new Rectangle(20, 60);

        System.out.println("Test1 is equal to test2: " + test1.equals(test2));
    }
}