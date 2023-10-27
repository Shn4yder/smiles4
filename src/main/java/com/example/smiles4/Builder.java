package com.example.smiles4;

import javafx.scene.layout.Pane;

public interface Builder{
    void buildHead(Pane pane);
    void buildEyes(Pane pane);
    void buildBrows(Pane pane);
    void buildMouth(Pane pane);
    Smile getSmile();
}
