//package com.xiangxun.test20200115;
//
//import java.util.Arrays;
//
///**
// * 数据结构
// * 使用数组实现栈
// * 自己实现一个栈，要求这个栈具有push()、pop()（返回栈顶元素并出栈）、peek() （返回栈顶元素不出栈）、isEmpty()、size()这些基本的方法。
// * <p>
// * 提示：每次入栈之前先判断栈的容量是否够用，如果不够用就用Arrays.copyOf()进行扩容；
// */
//
//
//public class MyStack {
//    private int[] storage; //存放栈中元素的数组   栈中的东西 数组大小
//    private int capacity;  //栈的容量   栈的大小最大值
//    private int count;  //栈中元素数量  下标  元素多少
//    private static final int GROW_FACTOR = 2;
//
//    // TODO: 2020/1/15  不带初始容量参数的构造方法。默认容量为8
//    public MyStack() {
//        this.capacity = 8;
//        this.storage = new int[8];
//        this.count = 0;
//    }
//
//    // TODO: 2020/1/15 带初始容量参数的构造方法。
//    public MyStack(int initialCapacity) {
//        if (initialCapacity < 1) {
//            throw new IllegalArgumentException("Capacity too small");
//        }
//        this.capacity = initialCapacity;
//        this.storage = new int[initialCapacity];
//        this.count = 0;
//    }
//
//    // TODO: 2020/1/15 入栈
//    public void push(int value) {
//        if (count == capacity) {
//            ensureCapacity();
//        }
//
//        storage[count] = value;
//        count++;
//
//    }
//
//    // TODO: 2020/1/15 确保容量大小 扩容操作
//    private void ensureCapacity() {
//        int newCapacity = capacity * GROW_FACTOR;
//        storage = Arrays.copyOf(storage, newCapacity);
//        capacity = newCapacity;
//    }
//
//    // TODO: 2020/1/15 返回栈顶元素并出栈
//    private int pop() {
//        count--;
//        if (count == -1) {
//            throw new IllegalArgumentException("Stack is empty.");
//        }
//        return storage[count];
//    }
//
//    // TODO: 2020/1/15 返回栈内任意元素，不出栈（出不了，就看看。）
//    private int look(int index1) {
//        if (count != 0 && index1 <= count) {
//            return storage[index1 - 1];
//        } else {
//            throw new IllegalArgumentException("it's wrong.");
//        }
//    }
//
//    // TODO: 2020/1/15 返回栈顶元素但不出栈
//    private int peek() {
//        if (count == 0) {
//            throw new IllegalArgumentException("Stack is empty.");
//        } else {
//            return storage[count - 1];
//        }
//    }
//
//    // TODO: 2020/1/15 判断栈是否为空
//    private boolean isEmpty() {
//        return count == 0;
//    }
//
//    // TODO: 2020/1/15 返回栈中元素的个数
//    private int size() {
//        return count;
//    }
//
//
//    public static void main(String[] args) {
//        MyStack myStack = new MyStack(3);
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.push(5);
//        myStack.push(6);
//        myStack.push(7);
//        myStack.push(8);
//        System.out.println(myStack.look(8));
//        System.out.println(myStack.peek());
//
//        System.out.println(myStack.size());
//        for (int i = 0; i < 8; i++) {
//            System.out.println(myStack.pop());
//        }
//        System.out.println(myStack.isEmpty());//true
//        myStack.pop();//报错：java.lang.IllegalArgumentException: Stack is empty.
//    }
//}
//
