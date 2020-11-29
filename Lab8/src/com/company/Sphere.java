package com.company;

public class Sphere implements GeometricBody {
    private float radius;

    public Sphere(float radius) {
        this.radius = radius;
    }

    public float getSurface() {
        return (float) (4 * Math.PI * this.radius * this.radius);
    }

    public float getVolume() {
        return (float) (4 / 3 * Math.PI * this.radius * this.radius * this.radius);
    }
}
