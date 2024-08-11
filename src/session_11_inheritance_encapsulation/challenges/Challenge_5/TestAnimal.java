package session_11_inheritance_encapsulation.challenges.Challenge_5;

import session_11_inheritance_encapsulation.challenges.Challenge_2.Dog;
import session_11_inheritance_encapsulation.challenges.Challenge_3.Cat;
import session_11_inheritance_encapsulation.challenges.Challenge_4.Wolf;

public class TestAnimal {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
        Wolf wolf = new Wolf();
        wolf.sound();
    }
}
