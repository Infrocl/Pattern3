package com.example.pattern3.observer;


import com.example.pattern3.observable.Observable;
import com.example.pattern3.observer.Observer;

public class FaceObserver implements Observer {
    @Override
    public void update(Observable observable) {
        if (observable.getState() == 1) {
            observable.changeState(0);
        } else {
            observable.changeState(1);
        }
    }
}
