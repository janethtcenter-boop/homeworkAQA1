package lesson4;

public class Circle implements Geometry {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {

        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {

        return Math.PI * radius * radius;
    }
}
