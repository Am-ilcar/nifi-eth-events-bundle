package org.apache.nifi.services.ethereum;

import org.apache.nifi.annotation.documentation.CapabilityDescription;
import org.apache.nifi.annotation.documentation.Tags;
import org.apache.nifi.controller.ControllerService;

import java.util.EnumSet;
import java.util.function.Consumer;

@Tags({"ethereum", "eth2", "beacon", "blockchain", "events", "controller", "service"})
@CapabilityDescription("Service for connecting to an Ethereum beacon chain node and listening for events. " +
        "This service allows processors to subscribe to specific event types and receive notifications when those events occur. " +
        "It uses the java-eth-events-listener library to connect to the beacon chain node and listen for events.")
public interface BeaconEventsService extends ControllerService {

    /**
     * Subscribes to beacon chain events of the specified types.
     * 
     * @param eventTypes The types of events to subscribe to
     * @param eventConsumer The consumer that will process the events
     * @return A subscription ID that can be used to unsubscribe
     */
    String subscribeToEvents(EnumSet<EventType> eventTypes, Consumer<BeaconEvent> eventConsumer);

    /**
     * Unsubscribes from events using the subscription ID.
     * 
     * @param subscriptionId The subscription ID returned from subscribeToEvents
     * @return true if the subscription was found and removed, false otherwise
     */
    boolean unsubscribeFromEvents(String subscriptionId);

    /**
     * Gets the URL of the beacon chain node.
     * 
     * @return The URL of the beacon chain node
     */
    String getBeaconNodeUrl();

    /**
     * Legacy method for backward compatibility.
     * 
     * @deprecated Use {@link #subscribeToEvents(EnumSet, Consumer)} instead.
     */
    @Deprecated
    void execute();
}
