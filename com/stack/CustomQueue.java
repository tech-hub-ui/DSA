package com.stack;

public class CustomQueue {

    private int[] data;
    private static final int DEAFUALT_SIZE=10;
   int end=0;

    public CustomQueue(){
        this(DEAFUALT_SIZE);
    }


    public CustomQueue(int size) {
        this.data =new int[size] ;
    }
    public  boolean isfull(){
       return end==data.length;
        }

        public boolean isempty(){
        return end==0;
        }

    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++]=item;
        return true;
    }
    public int empty() throws Exception{
        if(isempty()){
            throw new Exception("Queue is Empty");
        }
        int removed=data[0];
        for (int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;

    }


}
