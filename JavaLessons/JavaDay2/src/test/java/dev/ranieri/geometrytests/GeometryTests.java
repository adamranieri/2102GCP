package dev.ranieri.geometrytests;

import dev.ranieri.tdd.GeoCalcImpl;
import dev.ranieri.tdd.GeometryCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeometryTests {

    GeometryCalculator calc = new GeoCalcImpl();

    @Test // any method can become a test by putting at test on top of it
    void area_square_test_1(){
        // tests always pass unless an exception is thrown/created in them
        double area = calc.areaSquare(10);
        Assertions.assertEquals(100, area);
    }

    @Test
    void area_circle_test_1(){
        double area = calc.areaCircle(5);
        Assertions.assertEquals(78.6475, area,0.2); // sometimes when you write a test with number precision you can a tolerance
    }

}
