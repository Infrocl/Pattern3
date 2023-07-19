package com.example.template.template;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class FigureAnimation implements Runnable {
    private final Figure figure;

    public FigureAnimation(Figure figure) {
        this.figure = figure;
    }

    @Override
    public void run() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(100), event -> figure.move()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
}
