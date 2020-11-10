package com.company;

public class I extends H {
    protected String i = "i";

    public I () {}
    public I (String state) {this.i = state;}

    @Override
    protected void printState() {
        System.out.println(i);
    }
}
