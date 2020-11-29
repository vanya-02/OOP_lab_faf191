package com.company;

import java.util.ArrayList;

public class GeometricBodyController {

    static GeometricBody BiggestSurface(ArrayList<GeometricBody> Bodies) {
        float biggestSurface = 0;
        GeometricBody biggestBody = null;

        for (GeometricBody body: Bodies) {
            if (body.getSurface() > biggestSurface) {
                biggestBody = body;
            }
        }

        return biggestBody;
    }

    static GeometricBody BiggestVolume(ArrayList<GeometricBody> Bodies) {
        float biggestVolume = 0;
        GeometricBody biggestBody = null;

        for (GeometricBody body: Bodies) {
            if (body.getSurface() > biggestVolume) {
                biggestBody = body;
            }
        }

        return biggestBody;
    }

}
