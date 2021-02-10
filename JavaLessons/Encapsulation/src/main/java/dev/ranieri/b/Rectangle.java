package dev.ranieri.b;

import dev.ranieri.a.Shape;

public class Rectangle extends Shape {

    public void rectanglePubMethod(){
         // this.privMethod(); even though rectangle has this method It can't access it
        this.proMethod();
        System.out.println("Hello from the rectangle Protected Method");
    }


}
