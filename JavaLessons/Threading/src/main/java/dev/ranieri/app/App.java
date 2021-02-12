package dev.ranieri.app;

public class App {

    public static void main(String[] args) {
        // Thread is a path of execution through a program/code
        // Java is multi threaded language
        // You can run multiple different pieces of code at the SAME TIME (Multi Threading)

        // lambda you are defining a block of code
        Runnable process1 = () -> {
            System.out.println(Thread.currentThread()); // print out the name of the thread this block of code is executing on
            System.out.println("Hello I am a piece of code ");
        };

        // Thread class in Java is used to create threads
        Thread t1 = new Thread(process1);
        Thread t2 = new Thread(process1);
        Thread t3 = new Thread(process1);

        // Starts a new thread  create a thread and execute the code we passed in
        // Whenever you start multiple threads it becomes difficult to know when exactly they will execute
        t1.start();
        t2.start();
        t3.start();

        // executes code on the current thread no simultaneous thread
//        t1.run();
//        t2.run();
//        t3.run();

        System.out.println(Thread.currentThread());


    }
}
