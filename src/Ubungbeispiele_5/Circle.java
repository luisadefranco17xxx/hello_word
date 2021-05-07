package Ubungbeispiele_5;

import java.util.Objects;

public class Circle implements Figure{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*3.1415;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2)*3.1415;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Circle circle = (Circle) o;
//        return Double.compare(circle.radius, radius) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(radius);
//    }
}
