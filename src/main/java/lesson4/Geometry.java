package lesson4;

public interface Geometry {
    double calculatePerimeter();
    double calculateArea ();
}
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
public class Rectangle implements Geometry {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = 3;
        this.height = 5;
    }

    @Override
    public double calculatePerimeter() {

        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateArea(double width,double height) {

        return width * height;
    }
}
public class Triangle implements Geometry {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    @Override
    public double calculatePerimeter() {

        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() /2 ;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}



