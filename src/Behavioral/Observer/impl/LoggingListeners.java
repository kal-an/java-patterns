package Behavioral.Observer.impl;

import Behavioral.Observer.EventListeners;

public class LoggingListeners implements EventListeners {

    private String log;
    private String message;

    public LoggingListeners(String log, String message) {
        this.log = log;
        this.message = message;
    }

    @Override
    public void update(String filename) {

    }
}
