package org.apache.nifi.services.ethereum;

import java.util.Objects;

/**
 * Minimal Beacon Event representation decoupled from any external library.
 * Data is represented as a raw JSON string to avoid API dependencies.
 */
public final class BeaconEvent {
    private final EventType eventType;
    private final String jsonData;

    public BeaconEvent(final EventType eventType, final String jsonData) {
        this.eventType = Objects.requireNonNull(eventType, "eventType");
        this.jsonData = Objects.requireNonNull(jsonData, "jsonData");
    }

    public EventType getEventType() {
        return eventType;
    }

    /**
     * Returns the event payload as a JSON string.
     */
    public String getJsonData() {
        return jsonData;
    }

    @Override
    public String toString() {
        return "BeaconEvent{" +
                "eventType=" + eventType +
                ", jsonData='" + jsonData + '\'' +
                '}';
    }
}
