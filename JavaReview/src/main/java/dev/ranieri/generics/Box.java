package dev.ranieri.generics;

public class Box<T> {

     private T something;

    boolean isEmpty(){
        if(this.something ==null){
            return  true;
        }else{
            return  false;
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "something=" + something +
                '}';
    }

    public  T getSomething() {
        return this.something;
    }

    public void setSomething(T something) {
        this.something = something;
    }
}
