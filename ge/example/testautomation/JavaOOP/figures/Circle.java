package ge.example.testautomation.JavaOOP.figures;

import ge.example.testautomation.JavaOOP.util.numberOfInstances;

public class Circle {
    private double radius;

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public Circle (double radius) {
        if (radius < 0) {
            throw new IlligalArgumentException(
                    "Radius cannot be negative"
            );
        }
        this.radius =radius;
        numberOfInstances = numberOfInstances + 1;
    }
}