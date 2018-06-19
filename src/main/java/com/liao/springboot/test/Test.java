package com.liao.springboot.test;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
//        MyStack myStack = new MyStack(2);
//        myStack.push("aa");
//        myStack.push("fre");
//        myStack.push("fre");
//        myStack.push("fre");
//        myStack.push("fre");
//
//
//        while(!myStack.isEmpty()) {
//            System.out.println(myStack.pop());
//            System.out.println(myStack.getSize());
//        }

        MyQueue myQueue = new MyQueue(5);
        myQueue.add(1);
        myQueue.add(2);
        System.out.print(myQueue.peek());



    }
}
