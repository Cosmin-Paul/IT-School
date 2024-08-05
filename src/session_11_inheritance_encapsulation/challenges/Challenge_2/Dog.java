package session_11_inheritance_encapsulation.challenges.Challenge_2;

import session_11_inheritance_encapsulation.challenges.Challenge_1.Animal;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dogs make a particular sound: 'bark'");
    }
}
