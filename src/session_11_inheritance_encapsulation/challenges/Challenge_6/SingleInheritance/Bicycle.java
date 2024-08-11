package session_11_inheritance_encapsulation.challenges.Challenge_6.SingleInheritance;

public class Bicycle {
    private int speed;
    public int gear;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
    public int changeGear(){
        return this.gear;

    }
    public int speedUp(int i){
        return this.speed;
    }
    public int applyBrake(int i){
        return speed;
    }
}