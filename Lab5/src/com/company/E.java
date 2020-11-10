package com.company;

public class E extends D {
    protected String e = "e";

    public E () {}
    public E (String state) {
        this.e = state;
    }

    @Override
    protected void printState() {
        System.out.println(e);
    }
}
