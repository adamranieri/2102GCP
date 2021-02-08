package dev.ranieri.garbage;

public class GarbagePlayground {

    public static void main(String [] args){

        Book wutheringHeights = new Book();
        wutheringHeights.title = "Wuthering Heights";
        wutheringHeights.author = "Emile Bronte";

        Book frankenstein = new Book();
        frankenstein.title ="Frankenstein";
        frankenstein.author = "Mary Shelley";

        System.out.println(wutheringHeights.title);
        System.out.println(wutheringHeights.author);

        System.out.println(frankenstein.title);
        System.out.println(frankenstein.author);

        // Garbage collection is the process by which objects which are no longer referenced (unreachable)
        // get deleted. This frees up memory
        wutheringHeights = null;
        frankenstein = null;

        // There is no way to delete objects in memory
        System.gc(); // Politely ask Java to delete objects that are not referenced anymore
        // Java might not do garbage collection anyway


    }
}
