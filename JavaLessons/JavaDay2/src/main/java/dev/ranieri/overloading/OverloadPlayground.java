package dev.ranieri.overloading;

// Overloading is when a class has multiple methods of the same name
// The methods have to have different parameters
// Overloading allows us developers to more succinctly name methods
public class OverloadPlayground {

    // static polymophism == overloading // true
    // when java compiles it sees the different overloaded methods as distinctly different
    public static void main(String[] args) {
        double sum = OverloadPlayground.add(102.4 , 97.3);
        System.out.println(sum);
        double sum1 = OverloadPlayground.add("76","98.4");
        System.out.println(sum1);

        double [] nums = {98.1, 1.2, 77.3, 12.8}; // array literal syntax
        double sum2 = sum(nums);
        double sum3 = sum(76,32,56,90,12.6,34.5); // var args allows you  to do this

    }

    // the add method is overloaded
    static double add(double num1, double num2){
        return  num1 + num2;
    }

    static  double add(String num1, String num2){
        double n1 = Double.parseDouble(num1); // reads a string and turns into the double version
        double n2 = Double.parseDouble(num2);
        return  n1 + n2;
    }

    // varargs ... is helpful in that while you can pass in an array
    // ray will always be treat as an array
    static double sum(double... ray){
        double sum = 0;

        for(int i = 0; i<ray.length ;i++){
            sum = sum + ray[i];
        }

        return sum;
    }
    static double sum(String... ray){
        double sum = 0;

        for(int i = 0; i<ray.length ;i++){
            sum = sum + Double.parseDouble(ray[i]);
        }

        return sum;
    }


}
