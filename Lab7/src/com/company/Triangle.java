package com.company;

public class Triangle extends Figure {
    public float sideA;
    public float sideB;
    public float sideC;

    public Triangle(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    float getArea() {
        float halfPerimeter = getPerimeter() / 2;

        return (float) Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    @Override
    float getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
}
