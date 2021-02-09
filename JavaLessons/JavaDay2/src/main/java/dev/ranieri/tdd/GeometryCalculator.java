package dev.ranieri.tdd;

// You were tasked with creating a calculator that can perform certain Geometric calculations
// TDD
// 1. Write an interface clealy defining the methods that you need to accomplish a task
// 2. write tests to verify that any implementation we write is correct
// 3. Write the implementation

public interface GeometryCalculator {

    double areaSquare(double sideLength);
    double areaCircle(double radius);
    double distanceBetweenPoints(double x1, double x2, double y1, double y2);


}
