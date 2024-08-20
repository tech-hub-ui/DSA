package com.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ll LL=new ll();
        LL.insert(10);
        LL.insert(20);
        LL.insert(10);
        LL.insert(20);
        LL.insert(10);
        LL.insert(20);
        LL.insert(10);
        LL.insert(20);
        LL.insert(10);
        LL.insert(20);
        LL.insert(30);

        LL.del();
        LL.del();
        LL.display();

    }
}
