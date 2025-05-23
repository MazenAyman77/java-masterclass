package com.amigoscode.threads;

public class A implements Runnable{

    @Override
    public void run(){

        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");

            try{
                Thread.sleep(5);
            }catch (InterruptedException e){
                e.getMessage();
            }

        }
    }
}
