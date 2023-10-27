package com.example.smiles4;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class BBuilder implements Builder{

    private Smile smile;
    public BBuilder() {
        smile = new Smile();
    }
    public void buildHead(Pane pane) {
        Head head = new Head(100, Color.RED, pane);
        smile.setHead(head);
    }
    public void buildEyes(Pane pane) {
        Eyes [] eyes = new Eyes[]{new Eyes(), new Eyes()};
        eyes[0].firstEye(pane);
        eyes[1].secondEye(pane);
        smile.setEyes(eyes);
    }
    public void buildBrows(Pane pane) {
        Brows [] brows = new Brows[]{new Brows(), new Brows()};
        brows[0].firstBadBrow(pane);
        brows[1].secondBadBrow(pane);
        smile.setBrows(brows);
    }

    public void buildMouth(Pane pane) {
        Mouth mouth = new Mouth();
        mouth.badMouth(pane);
        smile.setMouth(mouth);
    }
    public Smile getSmile() {
        return smile;
    }
}