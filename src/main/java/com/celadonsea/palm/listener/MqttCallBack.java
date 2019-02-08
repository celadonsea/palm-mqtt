package com.celadonsea.palm.listener;

import com.celadonsea.palm.client.MessageClient;
import com.celadonsea.palm.config.MessageClientConfig;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Provides functionality for arrived message callback.
 *
 * @author Rafael Revesz
 * @since 1.0
 */
@Slf4j
public class MqttCallBack extends CallBack implements MqttCallback {

    public MqttCallBack(MessageClient messageClient, MessageClientConfig messageClientConfig) {
        super(messageClient, messageClientConfig);
    }


    /**
     * This method is called when the MQTT connection to the server is lost.
     * The method tries to reconnect to the broker, and resubscribe to
     * all stored topics.
     *
     * @param cause the reason behind the loss of connection.
     */
    @Override
    public void connectionLost(Throwable cause) {
        super.connectionLost(cause);
    }

    /**
     * This method is called when a message arrives from the server.
     *
     * @param topic name of the topic on the message was published to
     * @param message the actual message.
     * @throws Exception if a terminal error has occurred, and the client should be
     * shut down.
     */
    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        messageArrived(topic, message.getPayload());
    }

    /**
     * Called when delivery for a message has been completed, and all
     * acknowledgments have been received. For QoS 0 messages it is
     * called once the message has been handed to the network for
     * delivery. For QoS 1 it is called when PUBACK is received and
     * for QoS 2 when PUBCOMP is received. The token will be the same
     * token as that returned when the message was published.
     *
     * @param token the delivery token associated with the message.
     */
    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        log.debug("Message delivered: " + token.toString());
    }
}
