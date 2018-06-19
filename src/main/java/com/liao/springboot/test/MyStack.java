package com.liao.springboot.test;

import java.util.Arrays;

public class MyStack {

    private Object array[];
    private int size;
    private int top = -1;
    private static final int DefaultCapacity = 10;

    public MyStack(int size) {
        if (size <= 0) {
            throw new RuntimeException("初始化容量不能小玉0");
        }
        this.size = size;
        this.array = new Object[size];
    }

    public MyStack() {
        this.size = DefaultCapacity;
        this.array = new Object[DefaultCapacity];
    }

    /**
     * 进栈
     */
    public void push(Object o) {
        isGrow(top+1);
        if (top == size - 1) {
            throw new RuntimeException("容量已满");
        }
        array[++top] = o;
    }


    /**
     * 判断空
     */
    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

    /**
     * 弹出元素
     */
    public Object pop() {
        return array[top--];
    }

    /**
     * 访问栈顶
     */
    public Object peek() {
        return array[top];
    }

    public int getSize() {
        return size;
    }

    public boolean isGrow(int minCapacity) {
        int oldCapacity = size;

        if (minCapacity >= oldCapacity) {
            int newCapacity;
            if ((oldCapacity << 1) - Integer.MAX_VALUE > 0) {
                newCapacity = Integer.MAX_VALUE;
            } else {
                newCapacity = oldCapacity << 1;
            }
            this.size = newCapacity;
            array = Arrays.copyOf(array, newCapacity);
            return true;
        }
        return false;
}

    @Override
    public String toString() {
        return "MyStack{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                ", top=" + top +
                '}';
    }
}
