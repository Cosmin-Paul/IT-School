package session_14_polymorphism.practice.compiletime_polymorphism;

public class Geometry {
    public double area(double radius) {
        return 3.14 * radius * radius;
       // return Math.PI * radius * radius;
    }

    public double area(double base, double height) {
        return 0.5 * base * height;
    }
}