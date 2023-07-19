package com.example.pattern3.observable;

import com.example.pattern3.observable.Observable;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class DrawNose extends Region implements Observable {
    private int state;
    private final double x;
    private final double y;

    public DrawNose(int state, double x, double y) {
        if (state != 1 && state != 0) {
            throw new IllegalArgumentException("Неверное состояние! Допустимо 0 или 1");
        }
        this.x = x;
        this.y = y;
        changeState(1);
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void changeState(int state) {
        if (state == 1) {
            drawNose();
        }
        if (state == 0) {
            drawPinkNose();
        }
        this.state = state;
    }

    private void drawNose() {
        Circle nose = new Circle(x, y, 20);
        nose.setFill(Color.WHITE);
        nose.setStroke(Color.BLACK);
        getChildren().addAll(nose);
    }

    private void drawPinkNose() {
        Circle nose = new Circle(x, y, 20);
        nose.setFill(Color.LIGHTPINK);
        nose.setStroke(Color.BLACK);
        getChildren().addAll(nose);
    }
}
