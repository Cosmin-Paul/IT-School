package session_14_polymorphism.practice.composition_over_inheritance.Composition;

public class Car {

    //HAS-A  - Car - E
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }
}
