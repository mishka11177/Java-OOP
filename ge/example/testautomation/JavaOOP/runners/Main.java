package example.testautomation.JavaOOP.runners;

import example.testautomation.JavaOOP.figures.Circle;
import example.testautomation.JavaOOP.util.Util;

public class Main {
    public static double generateRadius(int min, int max){
        return min + (int) (Math.random() * (max - min +1));
    }

    public static void main(String[] args) {
        Circle[] circles = new Circle[5];

        for (int i = 0; i < circles.length; i++){
            circles[i] = new Circle(generateRadius(i * 10 + 1, (i+1) * 10));
            System.out.println(Circle.numberOfCircleInstances);
        }

        for (Circle circle : circles) {
            String result = Util.circleToString(circle);
            System.out.println(result);
        }
    }
}
