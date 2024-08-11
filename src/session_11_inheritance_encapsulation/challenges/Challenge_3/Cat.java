package session_11_inheritance_encapsulation.challenges.Challenge_3;

import session_11_inheritance_encapsulation.challenges.Challenge_1.Animal;

public class Cat extends Animal {

    @Override
    public void sound() {
        {
            System.out.println("Meoww");
        }
    }
}
