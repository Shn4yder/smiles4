package com.example.smiles4;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Eyes extends Circle {

    public Eyes(){
        super(15, Color.BLACK);
    }
    public void firstEye( Pane pane){
        super.setCenterX(pane.getWidth() / 2 - 40);
        super.setCenterY(pane.getHeight() / 2 - 25);
    }
    public void secondEye( Pane pane){
        super.setCenterX(pane.getWidth() / 2 + 40);
        super.setCenterY(pane.getHeight() / 2 - 20);
    }
}
