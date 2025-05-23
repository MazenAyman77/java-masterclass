package com.amigoscode.dsa;

import java.util.Stack;

public class TheStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(36);
        stack.push(35);
        stack.push(453);
        stack.push(54);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());
    }
}
