package com.example.pattern3.observer;

import com.example.pattern3.observable.Observable;

public interface Observer {
    void update(Observable observable);
}
