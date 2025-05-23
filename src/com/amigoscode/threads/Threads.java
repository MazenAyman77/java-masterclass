package com.amigoscode.threads;

public class Threads implements Runnable {

    public static int amount = 0;

    public static void main(String[] args) {
        Threads obj = new Threads();
        Thread t = new Thread(obj);
        t.start();
        // to avoid concurrency
        while (t.isAlive()){
            System.out.println("waiting .........");
        }
        System.out.println("this is printing out of the thread");
        System.out.println(amount);
        amount ++;
        System.out.println(amount);
    }

    @Override
    public void run() {
        System.out.println("this is printing inside the thread");
        amount ++;
    }
}
