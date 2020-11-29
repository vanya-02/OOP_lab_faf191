package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();

        figures.add(new Square(4));
        figures.add(new Rectangle(4, 3));
        figures.add(new Triangle(4, 3, 10));

        System.out.println(FigureController.BiggestArea(figures).getArea());
        System.out.println(FigureController.BiggestPerimeter(figures).getPerimeter());

        System.out.println("-----------------------------------");

        float anonymousCircleRadius = 10;

        figures.add(new Figure() {
                float getArea() {
                    return (float) (anonymousCircleRadius * anonymousCircleRadius * Math.PI);
                }

                float getPerimeter() {
                    return (float) (anonymousCircleRadius * 2 * Math.PI);
                }
            }
        );

        System.out.println(FigureController.BiggestArea(figures).getArea());
        System.out.println(FigureController.BiggestPerimeter(figures).getPerimeter());
    }
}
