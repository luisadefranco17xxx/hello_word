package Ubungbeispiele_5;

public class Rectangle implements Figure {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2*length*width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
