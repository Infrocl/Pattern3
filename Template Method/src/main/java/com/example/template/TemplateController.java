package com.example.template;

import com.example.template.template.*;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class TemplateController {
    private int flag;

    @FXML
    AnchorPane pane;

    @FXML
    protected void onStartButtonClicked() {
        Figure figure = getFigure();
        pane.getChildren().add(figure.getImageView());
        Thread thread = new Thread(new FigureAnimation(figure));
        thread.start();
    }

    @FXML
    protected void onStopButtonClicked() {
        System.exit(0);
    }

    private Figure getFigure() {
        switch (flag) {
            case 0 -> {
                flag++;
                return new Ball();
            }
            case 1 -> {
                flag++;
                return new Star();
            }
            case 2 -> {
                flag = 0;
                return new Heart();
            }
        }
        return new Ball();
    }
}