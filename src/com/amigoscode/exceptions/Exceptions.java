package com.amigoscode.exceptions;

public class Exceptions {

    // Runtime Exception
    private static double divide(int a, int b) throws IllegalArgumentException {

        // a method illustrating throwing an exception
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // here we demonstrate the throws function ie. passing the responsibility with dealing with the exception, Compile time exception
//    private static double multiply(int a, int b) throws Exception{
//
//        // a method illustrating throwing an exception
//        if (b==100){
//            throw new Exception("Cannot multiply by 100");
//        }
//        return a*b ;
//    }
//    private static void michale() throws Exception{
//        System.out.println(multiply(10,100));
//    }
//    private static void maria() throws Exception{
//        System.out.println(multiply(10,100));
//    }
//    private static void john(){
//        System.out.println(multiply(10,100));
//    }


    // creating your own exception: - decide wether its checked or run time exception

    private static double divide2(int a, int b) {

        if (b == 0) {
            throw new Myuncheckedexception("Cannot divide by zero");
        }
        return a / b;
    }

    private static double multiply2(int a, int b) throws Exception {

        // a method illustrating throwing an exception
        if (b == 100) {
            throw new Mycheckedexception("cannot multiply by 100");
        }
        return a * b;
    }


    public static void main(String[] args) {

        // you can have as many as catch blocks as you want just you should know the exeception
        try {
            int number = Integer.parseInt("1x");
            System.out.println(number);

            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("your are parsing a word wich cannot be parsed");
            // e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("cannot divide by zero");
//            e.printStackTrace();
        } catch (Exception e) {
            // here we used Exception as an argument bec. in cases we dont know the exception that will be thrown
            // catch all exceptions
            e.getMessage();
        } finally {
            // this code block will always execute regardless, this is mainly used for cleanup purposes
            System.out.println("finally always run");
        }


        // to throw exceptions, i used a method called divide
        System.out.println(divide(10, 0));
        System.out.println(divide2(10, 0));
    }
}
