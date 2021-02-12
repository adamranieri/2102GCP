package dev.ranieri.app;

import java.util.ArrayList;
import java.util.List;

public class MultiThreading {

    public static int[] nums = new int[100000000];
    public static List<Integer> runTime = new ArrayList<Integer>();

    public static Runnable r1 = () -> {


        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            factorize(100000);
            System.out.println(Thread.currentThread().getName() + "current iteration "+ i);
        }
        long end = System.nanoTime();

        int time = (int) ((end-start)/1000000000);
        runTime.add(time);

        System.out.println("time in seconds " + time );

    };

    public static void main(String[] args) {
        spawnThreads(4);
    }

    public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    public static void factorize(int n) {

        for (int i = 0; i < n; i++) {
            primeFactors(i);
        }
    }

    public static void spawnThreads(int num) {

        for(int i =0;i<num;i++) {
            Thread t1 = new Thread(r1);
            t1.start();
        }
    }
}
