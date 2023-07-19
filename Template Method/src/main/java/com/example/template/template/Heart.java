package com.example.template.template;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Heart extends Figure {
    @Override
    protected ImageView createImageView() {
        try {
            return new ImageView(new Image(new FileInputStream("C:\\Users\\Marina\\IdeaProjects\\demo\\Pattern3\\Template Method\\src\\main\\resources\\com\\example\\template\\heart.png")));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
