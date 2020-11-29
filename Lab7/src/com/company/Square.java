package com.company;

public class Square extends Figure {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    float getArea() {
        return this.side * this.side;
    }

    @Override
    float getPerimeter() {
        return this.side * 4;
    }
}
