package com.stack;

public class Main
{
    public static void main(String[] args) throws Exception {
        CircularQueue queue =new CircularQueue();

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(3);
        queue.insert(3);
        queue.insert(3);
        queue.insert(3);
        queue.insert(3);
        queue.insert(3);
        queue.insert(3);
queue.disply();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.disply();
    }
}
