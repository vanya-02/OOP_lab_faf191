package com.company;

public class F extends E {
    protected String f = "f";

    public F () {}
    public F (String state) {this.f = state;}

    @Override
    protected void printState() {
        System.out.println(f);
    }
}
