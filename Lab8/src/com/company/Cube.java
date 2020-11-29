package com.company;

public class Cube implements GeometricBody {
    private float edge;

    public Cube(float edge) {
        this.edge = edge;
    }

    public float getSurface() {
        return this.edge * this.edge * 6;
    }

    public float getVolume() {
        return this.edge * this.edge * this.edge;
    }
}
