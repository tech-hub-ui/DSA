package com.stack;

public class CircularQueue {
    private int[] data;
    private static final int DEAFUALT_SIZE=10;
    int end=0;
    int front=0;
    int size=0;

    public CircularQueue(){
        this(DEAFUALT_SIZE);
    }


    public CircularQueue(int size) {
        this.data =new int[size] ;
    }
    public  boolean isfull(){
        return size==data.length;
    }

    public boolean isempty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++]=item;
        end=end% data.length;
        size++;
        return true;

    }
    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Circular Queue is Empty!!!");
        }

     int removed=data[front++];
        front=front% data.length;
        size--;

        return removed;
    }
    public void disply(){
      int i=front;
      do {
          System.out.print(data[i++]
          +"->");
          i=i% data.length;

      }while (i!=end);
        System.out.println("End");

    }


}
