package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<GeometricBody> figures = new ArrayList<>();

        figures.add(new Cube(4));
        figures.add(new Sphere(4));
        figures.add(new Parallelepiped(4, 3, 10));

        System.out.println(GeometricBodyController.BiggestSurface(figures).getSurface());
        System.out.println(GeometricBodyController.BiggestVolume(figures).getVolume());
    }
}
