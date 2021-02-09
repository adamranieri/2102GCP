package dev.ranieri.tdd;

// impl is a fairly common naming convention for class that implement an interface
public class GeoCalcImpl implements GeometryCalculator {

    @Override
    public double areaSquare(double sideLength) {
        return sideLength*sideLength;
    }

    @Override
    public double areaCircle(double radius) {
        double area = radius*radius* Math.PI;
        return area;
    }

    @Override
    public double distanceBetweenPoints(double x1, double x2, double y1, double y2) {
        return 0;
    }

}
