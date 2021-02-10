package dev.ranieri.b;

import dev.ranieri.a.Shape;

public class BPlayground {

    public static void main(String[] args) {
        Shape s = new Shape();
        s.pubMethod();
        //s.proMethod(); // can be seen because it is the same package
        //s.defMethod(); // can be seen because it is the same package

        Rectangle r = new Rectangle();
        r.rectanglePubMethod();
        r.pubMethod(); //inherited method

    }
}
