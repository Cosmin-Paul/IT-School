package session_14_polymorphism.practice.composition_over_inheritance.Inheritance;

public class Car extends Engine {

    @Override
    void start() {
        System.out.println("This car is moving");
    }
}