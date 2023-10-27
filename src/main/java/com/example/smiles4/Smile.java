package com.example.smiles4;

import javafx.scene.Group;

public class Smile extends Group {
    public Smile() {
    }
    public void setHead(Head m) {
        getChildren().add(m);
    }
    public void setMouth(Mouth m) {
        getChildren().add(m);
    }
    public void setEyes(Eyes m[]) {
        for (Eyes i:m) {
            getChildren().add(i);
        }
    }
    public void setBrows(Brows m[]) {
        for (Brows i:m) {
            getChildren().add(i);
        }
    }
    public String toString() {
        return new String("Смайлик");
    }
}