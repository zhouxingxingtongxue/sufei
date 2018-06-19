package com.liao.springboot.test;

public class MyQueue<E> {

    private Object[] objects;
    private int size;
    private int front;
    private int rear;

    public MyQueue(int size) {
        if (size < 0) {
            throw new RuntimeException("初始化容量必须大于0");
        }
        this.size = size;
        this.objects = new Object[size];
        front = 0;
        rear = 0;
    }

    public MyQueue() {
        this(10);
    }

    /**
     * 判断空
     * @return
     */
    public boolean empty() {
        return front == size ? true : false;
    }

    /**
     * 插入
     * @return
     */
    public void add(E e) {
        if(rear == size) {
            throw new RuntimeException("队列已满");
        }
        objects[rear++] = e;
    }

    /**
     * 返回队首但不删除
     * @return
     */
    public E peek() {
      if(empty()) {
          throw new RuntimeException("队列为空");
      }
      return (E) objects[front];
    }

    /**
     * 出队
     * @return
     */
    public E poll(E e) {
        if(empty()) {
            throw new RuntimeException("队列为空");
        }
        E value = (E) objects[front];
        objects[front] = null;
        return value;
    }

    public int length() {
        return rear - front;
    }


}
