package session_14_polymorphism.practice.runtime_polymorphism;

public class Apple  extends Fruit{

    @Override
    public String taste() {
        return "This apple is so sweet";
    }

    @Override
    public String colour() {
        return "This is an red apple";
    }
}
