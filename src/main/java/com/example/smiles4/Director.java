package com.example.smiles4;

import javafx.scene.layout.Pane;

public class Director {
    public Smile build(Builder builder, Pane pane) {

        builder.buildHead(pane);
        builder.buildEyes(pane);
        builder.buildBrows(pane);
        builder.buildMouth(pane);
        return builder.getSmile();
    }
}
