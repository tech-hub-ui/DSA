package com.doublylinkedlist;

public class CLL {

    private Node head;
    private Node tail;


    public CLL(){
        this.head=null;
        this.tail=null;
    }

    public void insert(int val){
        Node node=new Node(val);
        if (head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public boolean isHappy(int n){
    int slow=n;
    int fast=n;
    do {
        slow=square(n);
        fast=square(square(n));
    }while (slow!=fast);

    if (slow==1){
        return true;
    }
    return false;
    }
    private int square(int n){
        int ans=0;
        while (n>0){
            int rem=n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;

    }
    //recursive reverse of linked list

public boolean palindrome(Node node){
        Node mid=midlist(node);
        Node second=reversell(mid);
        Node rereverse=second;

        while (node!=null  && second!=null){
            if(node.val!=second.val){
                break;
            }
            node=node.next;
                    second=second.next;

        }
        reversell(rereverse);

        if(node==null || second==null){
            return true;
        }


        return false;


}

public Node midlist(Node node){
        Node f=node;
        Node s=node;

        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;


        }
        return s;
}
    public   Node reversell(Node node){
        if(node==tail){
            head=tail;
            return head;
        }
        reversell(node);

        tail.next=node;
        tail=node;
        tail.next=null;
        return tail;

    }
    public void display(){
        Node node=head;
        if (head!=null){
            do {
                System.out.print(node.val+"->");
                node=node.next;
            }while (node!=head);
        }
    }


    private class Node{
        private int val;
      private   Node next;

      public Node(int val){
          this.val=val;
      }

    }
}
