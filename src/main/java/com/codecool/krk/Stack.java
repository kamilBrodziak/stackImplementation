package com.codecool.krk;

public class Stack<E> {
    private E[] array;
    int currIndicator = -1;

    public Stack(int size) {
        array = (E[])new Object[size];;
    }

    public void push(E value){
        if(currIndicator == array.length - 1 || array.length == 0) {
            throw new StackOverflow("Too much elements on stack");
        }
        array[++currIndicator] = value;
    }

    public E pop() {
        if(currIndicator == -1) {
            throw new StackUnderflow("No element on stack");
        }
        E temp = array[currIndicator];
        array[currIndicator--] = null;
        return temp;
    }

    public E peek() {
        if(currIndicator == -1) {
            throw new StackUnderflow("No element on stack");
        }
        return array[currIndicator];
    }

    @Override
    public String toString() {
        String a = "";
        if(currIndicator == -1) {
            return a;
        }
        for(int i = 0; i <= currIndicator; ++i) {
            a += " " + array[i].toString();
        }
        return a;
    }
}
