package com.amigoscode.threads;

public class B implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("hello");

            try{
                Thread.sleep(5);
            }catch (InterruptedException e){
                e.getMessage();
            }

        }

    }
}
