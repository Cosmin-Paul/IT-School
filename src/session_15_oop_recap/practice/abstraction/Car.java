package session_15_oop_recap.practice.abstraction;

public class Car implements Vehicle {


    @Override
    public void start() {

    }

    @Override
    public void stop() {
        System.out.println();

    }

    @Override
    public void accelerate() {
        System.out.println(" Car is accelerating");

    }
}
