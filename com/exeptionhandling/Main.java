package com.exeptionhandling;




public class Main {
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        int result =a/b;
        return result;
    };
    public static void main(String[] args) {
        int a=9;
        int b=0;

        System.out.println(divide(a,b));

    }
}
