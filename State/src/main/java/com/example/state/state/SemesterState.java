package com.example.state.state;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SemesterState implements State {
    @Override
    public Image getState() {
        try {
            return new Image(new FileInputStream("C:\\Users\\Marina\\IdeaProjects\\demo\\Pattern3\\State\\src\\main\\resources\\com\\example\\state\\3714960.jpg"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
