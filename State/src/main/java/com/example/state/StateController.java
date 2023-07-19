package com.example.state;

import com.example.state.state.HolidayState;
import com.example.state.state.SemesterState;
import com.example.state.state.SessionState;
import com.example.state.state.State;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class StateController {
    private State state;

    @FXML
    public ImageView image;

    @FXML
    public void semesterButtonClicked(ActionEvent event) {
        state = new SemesterState();
        image.setFitHeight(400);
        image.setFitWidth(400);
        image.setImage(state.getState());
    }

    @FXML
    public void sessionButtonClicked(ActionEvent event) {
        state = new SessionState();
        image.setFitWidth(400);
        image.setFitHeight(500);
        image.setImage(state.getState());
    }

    @FXML
    public void holidayButtonClicked(ActionEvent event) {
        state = new HolidayState();
        image.setFitHeight(400);
        image.setFitWidth(400);
        image.setImage(state.getState());
    }
}
