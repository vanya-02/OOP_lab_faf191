package com.company;

public class Parallelepiped implements GeometricBody {
    private float edgeA, edgeB, edgeC;

    public Parallelepiped(float edgeA, float edgeB, float edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public float getSurface() {
        return 2 * (edgeA * edgeB + edgeA * edgeC + edgeB * edgeC);
    }

    public float getVolume() {
        return edgeA * edgeB * edgeC;
    }
}
