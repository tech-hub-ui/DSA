package com.stack;
import  java.util.Stack;
public class inbuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(34);
        stack.push(35);
        stack.push(55);

        System.out.println(stack.pop());
    }
}
