package com.linkedlist;

public class ll {
    private Node head;
    private Node tail;

    private int size;
public ll(){
    this.size=0;
}

public void add(int value,int index){
    if(index==0){
        insert(value);
        return;
    }
    if (index==size){
        insertl(value);
        return;
    }

    Node temp=head;

    for (int i=1;i<index;i++){
        temp=temp.next;
    }

    Node node=new Node(value,temp.next);
    temp.next=temp;

    size++;




}
public int del(){
    int val=head.value;
    head=head.next;
    if( head==null){
        tail=null;
    }
    size--;
    return val;
}
public void insertl(int value){
    if(tail==null){
insert(value);
return;
    }
    Node node =new Node(value);

    tail.next=node;
    tail=node;

    size++;
}
public void insert(int value){
    Node node=new Node(value);
    node.next=head;
    head=node;
    if (tail==null){
        tail=head;
    }
    size++;
}

public void display(){
    Node temp=head;
    while (temp!=null){
        System.out.print(temp.value+" -> ");
        temp=temp.next;
    }
    System.out.print("END");
}


    private class Node{
        private int value;
        private Node next;

public Node (int value){
    this.value=value;
}

public Node(int value,Node next){
    this.value=value;
    this.next=next;
}
    }
}
