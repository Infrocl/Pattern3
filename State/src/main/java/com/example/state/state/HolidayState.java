package com.example.state.state;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HolidayState implements State {
    @Override
    public Image getState() {
        try {
            return new Image(new FileInputStream("C:\\Users\\Marina\\IdeaProjects\\demo\\Pattern3\\State\\src\\main\\resources\\com\\example\\state\\170667.jpg"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
