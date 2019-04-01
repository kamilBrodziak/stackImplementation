package com.codecool.krk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testPush() {
        Stack<Integer> stack = createStack(11);
        stack.push(11);
        stack.push(15);
        assertEquals(" 11 15", stack.toString());
    }

    @Test
    void testIfThrowStackOverflow() {
        Stack<Integer> stack = createStack(4);
        stack.push(11);
        stack.push(11);
        stack.push(13);
        stack.push(15);
        assertThrows(StackOverflow.class, () -> stack.push(12));
    }

    @Test
    void testPop() {
        Stack<Integer> stack = createStack(11);
        stack.push(12);
        stack.push(13);
        stack.push(15);
        assertEquals(Integer.valueOf(15), stack.pop());
        assertEquals(" 12 13", stack.toString());
    }

    @Test
    void testIfThrowStackUnderflow() {
        Stack<Integer> stack = createStack(3);
        assertThrows(StackUnderflow.class, () -> stack.pop());
        assertThrows(StackUnderflow.class, () -> stack.peek());
    }

    @Test
    void testPeek() {
        Stack<Integer> stack = createStack(5);
        stack.push(12);
        stack.push(13);
        assertEquals(Integer.valueOf(13), stack.peek());
        assertEquals(" 12 13", stack.toString());
    }


    private<E> Stack createStack(int size) {
        return new Stack<E>(size);
    }

}