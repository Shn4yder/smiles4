package com.example.smiles4;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;

public class Brows extends Polyline {
    public Brows() {
        super();
    }

    public void firstBadBrow(Pane pane) {
        super.getPoints().addAll(new Double[]{
                pane.getWidth() / 2 - 50, pane.getHeight() / 2 - 55,
                pane.getWidth() / 2 - 30, pane.getHeight() / 2 - 52,
                pane.getWidth() / 2 - 10, pane.getHeight() / 2 - 45}
        );
    }

    public void secondBadBrow(Pane pane) {
        super.getPoints().addAll(new Double[]{
                pane.getWidth() / 2 + 50, pane.getHeight() / 2 - 55,
                pane.getWidth() / 2 + 30, pane.getHeight() / 2 - 52,
                pane.getWidth() / 2 + 10, pane.getHeight() / 2 - 45}
        );
    }

    public void firstNeutralBrow(Pane pane) {
        super.getPoints().addAll(new Double[]{
                pane.getWidth() / 2 - 50, pane.getHeight() / 2 - 50,
                pane.getWidth() / 2 - 10, pane.getHeight() / 2 - 50}
        );
    }

    public void secondNeutralBrow(Pane pane) {
        super.getPoints().addAll(new Double[]{
                pane.getWidth() / 2 + 50, pane.getHeight() / 2 - 50,
                pane.getWidth() / 2 + 10, pane.getHeight() / 2 - 50}
        );

    }

    public void firstGoodyBrow(Pane pane) {
        super.getPoints().addAll(new Double[]{
                pane.getWidth() / 2 - 50, pane.getHeight() / 2 - 50,
                pane.getWidth() / 2 - 30, pane.getHeight() / 2 - 56,
                pane.getWidth() / 2 - 10, pane.getHeight() / 2 - 50}
        );
    }

    public void secondGoodyBrow(Pane pane) {
        super.getPoints().addAll(new Double[]{
                pane.getWidth() / 2 + 50, pane.getHeight() / 2 - 50,
                pane.getWidth() / 2 + 30, pane.getHeight() / 2 - 56,
                pane.getWidth() / 2 + 10, pane.getHeight() / 2 - 50}
        );
    }
}
