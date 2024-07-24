package session_15_oop_recap.practice.inheritance;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog("Bruno,", 20, "Dog", "Golden Retriever", Size.LARGE);
        dog.bark();
        dog.fetch();
    }
}
