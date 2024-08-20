package com.interfaces;

public class car implements engine,brake{
    @Override
    public void brake() {
        System.out.println("I brak elike a normal car");
    }

    @Override
    public void start() {
        System.out.println("I brak elike a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I brak elike a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I acc like a normal car");
    }
}
