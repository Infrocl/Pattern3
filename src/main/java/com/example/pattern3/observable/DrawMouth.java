package com.example.pattern3.observable;

import com.example.pattern3.observable.Observable;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class DrawMouth extends Region implements Observable {
    private int state;
    private final double x;
    private final double y;

    public DrawMouth(int state, double x, double y) {
        if (state != 1 && state != 0) {
            throw new IllegalArgumentException("Неверное состояние! Допустимо 0 или 1");
        }
        this.x = x;
        this.y = y;
        changeState(state);
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void changeState(int state) {
        if (state == 1) {
            drawMouth();
        }
        if (state == 0) {
            drawSmilingMouth();
        }
        this.state = state;
    }

    private void drawMouth() {
        if (!getChildren().isEmpty())
            getChildren().remove(0);
        Arc mouth = new Arc(x, y, 40, 40, 0, 180);
        mouth.setFill(Color.WHITE);
        mouth.setStroke(Color.BLACK);
        mouth.setType(ArcType.ROUND);
        getChildren().addAll(mouth);
    }

    private void drawSmilingMouth() {
        if (!getChildren().isEmpty())
            getChildren().remove(0);
        Arc mouth = new Arc(x, y - 40, 40, 40, 180, 180);
        mouth.setFill(Color.WHITE);
        mouth.setStroke(Color.BLACK);
        mouth.setType(ArcType.ROUND);
        getChildren().addAll(mouth);
    }
}
