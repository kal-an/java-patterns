package Behavioral.Observer;

import java.util.HashMap;

public class EventManager {

    private HashMap<String, EventListeners> listeners;

    public void subscribe(String eventType, EventListeners listener) {
        listeners.put(eventType, listener);
    }

    public void unSubscribe(String eventType, EventListeners listener) {
        listeners.remove(eventType, listener);
    }

    public void notify(String eventType, String data) {
        for (String listener : listeners.keySet()) {

        }
    }

}
