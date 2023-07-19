package com.example.state.state;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SessionState implements State {
    @Override
    public Image getState() {
        try {
            return new Image(new FileInputStream("C:\\Users\\Marina\\IdeaProjects\\demo\\Pattern3\\State\\src\\main\\resources\\com\\example\\state\\204932470.jpg"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
