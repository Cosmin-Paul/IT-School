package session_15_oop_recap.practice.inheritance;

public class Dog extends Animal {

    String breed;
Size size;

    public Dog(String name, int age, String species, String breed, Size size) {
        super(name, age, species);
        this.breed = breed;
        this.size = size;
    }

    void bark() {
    System.out.println(name + "Waf Waf");

}

void fetch() {
    System.out.println(name + "Brings me the ball!");
}
}
