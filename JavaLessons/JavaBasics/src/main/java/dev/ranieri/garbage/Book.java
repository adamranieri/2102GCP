package dev.ranieri.garbage;

public class Book {

    String title;
    String author;

    // a method that gets called when the object is deleted
    @Override
    public void finalize(){
        System.out.println("the book " + this.title + " was deleted");
    }

}
