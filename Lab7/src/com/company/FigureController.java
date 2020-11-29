package com.company;

import java.util.ArrayList;

public class FigureController {

    static Figure BiggestArea(ArrayList<Figure> Figures) {
        float biggestArea = 0;
        Figure biggestFigure = null;

        for (Figure figure: Figures) {
            if (figure.getArea() > biggestArea) {
                biggestFigure = figure;
            }
        }

        return biggestFigure;
    }

    static Figure BiggestPerimeter(ArrayList<Figure> Figures) {
        float biggestPerimeter = 0;
        Figure biggestFigure = null;

        for (Figure figure: Figures) {
            if (figure.getPerimeter() > biggestPerimeter) {
                biggestFigure = figure;
            }
        }

        return biggestFigure;
    }
}
