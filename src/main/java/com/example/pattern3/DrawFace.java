package com.example.pattern3;

import com.example.pattern3.observable.DrawEye;
import com.example.pattern3.observable.DrawMouth;
import com.example.pattern3.observable.DrawNose;
import com.example.pattern3.observer.FaceObserver;
import com.example.pattern3.observer.Observer;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class DrawFace extends Region {
    public DrawFace() {
        Observer observer = new FaceObserver();
        Circle face = new Circle(250, 250, 200);
        face.setFill(Color.WHITE);
        face.setStroke(Color.BLACK);

        DrawEye leftEye = new DrawEye(1, 150, 200);
        leftEye.setOnMouseClicked(mouseEvent -> observer.update(leftEye));

        DrawEye rightEye = new DrawEye(1, 350, 200);
        rightEye.setOnMouseClicked(mouseEvent -> observer.update(rightEye));

        DrawNose nose = new DrawNose(1, 250, 300);
        nose.setOnMouseClicked(mouseEvent -> observer.update(nose));

        DrawMouth mouth = new DrawMouth(1, 255, 400);
        mouth.setOnMouseClicked(mouseEvent -> observer.update(mouth));

        getChildren().addAll(face, mouth, nose, rightEye, leftEye);
    }
}
