package session_13_abstraction.practice;

public class Animal {

    void eat() {
        System.out.println("Animal is eating");

    }
}

class Dog extends Animal {

    void eat() {
        System.out.println("Dog is eating");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}