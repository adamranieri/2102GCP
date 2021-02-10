package dev.ranieri.a;

public class Shape {
// Java has Access modifiers
// Access modifiers limit where a variable can be seen
// THEY ARE NOT SCOPES
// 4 levels access modifiers in Java
// Access modifiers can ONLY be applied to fields and methods in a class

    public static int count =0;

    // PUBLIC
    // This method could be called anywhere in the application
    public void pubMethod(){
        System.out.println("Hello from the public method");
        this.privMethod();
    }

    //PROTECTED
    //Only within this packge +
    // any class that inherits from this class (child classes in other packages)
    protected void  proMethod(){
        System.out.println("Hello from  the protected method");
    }

    //DEFAULT
    // this method can only be called in this package
    void defMethod(){
        System.out.println("Hello from from the default method");
    }

    //PRIVATE
    // Can only be seen and accessed within this class
    private void privMethod(){
        System.out.println("Hello from the private Method");
    }


}
