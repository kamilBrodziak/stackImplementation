package com.codecool.krk;

public class StackUnderflow extends RuntimeException {
    public StackUnderflow() {

    }
    public StackUnderflow(String msg) {
        super(msg);
    }
}
