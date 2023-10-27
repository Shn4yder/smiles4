package com.example.smiles4;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;

public class Mouth extends Polyline {

    public Mouth() {
        super();
    }
    public void neutralMouth(Pane pane) {
        super.getPoints().addAll(new Double[]{
                200.0, 200.0,
                250.0, 200.0}
        );
    }

    public void badMouth(Pane pane) {
        super.getPoints().addAll(new Double[]{
                200.0, 200.0,
                250.0, 200.0,
                240.0, 180.0,
                210.0, 180.0,
                200.0, 200.0}
        );
    }

    public void goodyMouth(Pane pane) {
        super.getPoints().addAll(new Double[]{
                200.0, 200.0,
                250.0, 200.0,
                240.0, 220.0,
                210.0, 220.0,
                200.0, 200.0}
        );
    }
}
