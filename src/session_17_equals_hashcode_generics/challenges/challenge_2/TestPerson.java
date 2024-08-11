package session_17_equals_hashcode_generics.challenges.challenge_2;

public class TestPerson {
    public static void main(String[] args) {
        Person test1 = new Person("Cosmin", 30, "cosmin.cosmin@itschool.net");
        Person test2 = new Person("Catalin", 30, "Catalin.Catalin@itschool.net");

        System.out.println("Is test1 equal to test2: " + test1.equals(test2));
        System.out.println(test1.hashCode() + " " + test2.hashCode());
    }
}
