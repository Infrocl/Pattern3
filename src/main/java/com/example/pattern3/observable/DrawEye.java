package com.example.pattern3.observable;

import com.example.pattern3.observable.Observable;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class DrawEye extends Region implements Observable {
    private int state;
    private final double x;
    private final double y;

    public DrawEye(int state, double x, double y) {
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
            drawOpenEye();
        }
        if (state == 0) {
            drawClosedEye();
        }
        this.state = state;
    }

    private void drawOpenEye() {
        Circle eye = new Circle(x , y, 50);
        eye.setFill(Color.WHITE);
        eye.setStroke(Color.BLACK);
        Circle pupil = new Circle(x , y, 20);
        getChildren().addAll(eye, pupil);
    }

    private void drawClosedEye() {
        Circle eye = new Circle(x, y, 50);
        eye.setFill(Color.LIGHTPINK);
        eye.setStroke(Color.BLACK);
        Line line1 = new Line(x - 20, y - 20, x + 20, y + 20);
        line1.setStrokeWidth(2);
        Line line2 = new Line(x - 20, y + 20, x + 20, y - 20);
        line2.setStrokeWidth(2);
        getChildren().addAll(eye, line1, line2);
    }
}
