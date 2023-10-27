package com.example.smiles4;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Head extends Circle {
    private Circle circleHead;

    public Head(double radius, Color fill, Pane pane){
        super(radius);
        super.setFill(fill);
        super.setCenterX(pane.getWidth() / 2);
        super.setCenterY(pane.getHeight() / 2);
    }
}
