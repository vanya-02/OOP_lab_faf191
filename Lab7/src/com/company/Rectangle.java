package com.company;

public class Rectangle extends Figure {
    public float sideA;
    public float sideB;

    public Rectangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    float getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    float getPerimeter() {
        return (this.sideA + this.sideB) * 2;
    }
}
