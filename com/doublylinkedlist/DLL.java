package com.doublylinkedlist;

import com.linkedlist.ll;

public class DLL {
  private Node head;
  private Node tail;
  private int size;

public void insertfirst(int value){
   Node node=new Node(value);

   node.next=head;


   node.prev=null;
   if (head!=null){
       head.prev=node;
   }
   head=node;
   size++;
}
    public void insertl(int value){
        if(tail==null){
            insertfirst(value);
            return;
        }
        Node node =new Node(value);

        tail.next=node;
        tail=node;

        size++;
    }
public void add(int value,int index){
    if(index==0){
        insertfirst(value);
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
}
public void display(){
    Node node=head;
    tail=null;
    while(node!=null){
        System.out.print(node.value+"->");
        tail=node;
        node=node.next;

    }
    System.out.println("END");
}
    public void displayrev(){
        Node node=tail;
        while(node!=null){
            System.out.print(node.value+"->");
            node=node.prev;
        }
        System.out.println("END");
    }

    private class Node{
         int value;
         Node next;
         Node prev;

        public Node (int value){
            this.value=value;
        }

        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }

    }
}
