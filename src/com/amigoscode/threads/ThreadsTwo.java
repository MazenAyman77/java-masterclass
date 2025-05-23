package com.amigoscode.threads;

public class ThreadsTwo {

    public static void main(String[] args) throws InterruptedException {

        // instead of doing this, we can write lambda expression as runnable is a functional interface
//        A objOne = new A();
//        B objTwo = new B();

        Runnable objOne = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hi");

                try{
                    Thread.sleep(5);
                }catch (InterruptedException e){
                    e.getMessage();
                }

            }
            };


        Runnable objTwo = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hello");

                try{
                    Thread.sleep(5);
                }catch (InterruptedException e){
                    e.getMessage();
                }

            }
        };

        Counter c = new Counter();

        Runnable objThree = () -> {

            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }

        };

        Runnable objFour = () -> {

            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }

        };

        Thread threadOne = new Thread(objOne);
        Thread threadTwo = new Thread(objTwo);

        Thread threadThree = new Thread(objThree);
        Thread threadFour = new Thread(objFour);

        threadOne.start();
        threadTwo.start();

        threadThree.start();
        threadFour.start();

        threadOne.join();
        threadTwo.join();
        threadThree.join();
        threadFour.join();

        System.out.println(c.counter);


    }

}

class Counter {
    int counter;

    // keyword synchronized, java will make sure that this methode will be called once at a time
    public synchronized void increment() {
        counter++;
    }
}