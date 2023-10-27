package com.example.smiles4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.Group;
import javafx.scene.layout.Pane;

public class Controller extends Group {
    @FXML
    private Pane pane;
    Director direct = new Director();
    Smile smile;

    public void clickBad(ActionEvent actionEvent) {
        smile = direct.build(new BBuilder(), pane);
        //вернет значение типа Smile (в нем будет храниться уже собранный злой смайлик).
        pane.getChildren().add(smile);// создание рисунка путем добавления объекта к узлу -панели}
    }

    public void clickNeutral(ActionEvent actionEvent) {
        smile = direct.build(new NBuilder(), pane);
        //вернет значение типа Smile (в нем будет храниться уже собранный злой смайлик).
        pane.getChildren().add(smile);
    }

    public void clickGood(ActionEvent actionEvent) {
        smile = direct.build(new GBuilder(), pane);
        //вернет значение типа Smile (в нем будет храниться уже собранный злой смайлик).
        pane.getChildren().add(smile);
    }
}