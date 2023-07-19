package com.example.template.template;

import javafx.scene.image.ImageView;

public abstract class Figure {
    private final ImageView imageView;
    private int x = 1;
    private int y = 1;

    protected abstract ImageView createImageView();

    public Figure() {
        imageView = createImageView();
        imageView.setFitHeight(45);
        imageView.setFitWidth(45);
    }

    public void move() {
        if (imageView.getLayoutX() >= 450) {
            x = -1;
        } else if (imageView.getLayoutY() >= 450) {
            y = -1;
        } else if (imageView.getLayoutX() <= 0) {
            x = 1;
        } else if (imageView.getLayoutY() <= 60) {
            y = 1;
        }
        imageView.setLayoutX(imageView.getLayoutX() + x * 20);
        imageView.setLayoutY(imageView.getLayoutY() + y * 20);
    }

    public ImageView getImageView() {
        return imageView;
    }
}
