package example.testautomation.JavaOOP.figures;

public class Circle {
    private double radius;
    public static int numberOfCircleInstances = 0;

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public Circle (double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException(
                    "Radius cannot be negative"
            );
        }
        this.radius =radius;
        numberOfCircleInstances++;
    }
}