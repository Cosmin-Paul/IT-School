package session_11_inheritance_encapsulation.challenges.Challenge_6.SingleInheritance;

public class TestBike {
    public static void main(String[] args) {

        Bicycle bike1 = new Bicycle();
        int getSpeed = 50;
        int speedUp = 10;
        int sum = getSpeed + speedUp;
        int applyBrake = 5;

        bike1.setSpeed(getSpeed);
        System.out.println("Actualy speed is: " + getSpeed);


        bike1.speedUp(speedUp);
        System.out.println("Bike1 after speeding up: " + sum);

        bike1.applyBrake(applyBrake);
        System.out.println("Bike1 after brake: " + applyBrake);
    }
}