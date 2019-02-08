package com.celadonsea.palm.config;

public interface MqttClientConfig extends MessageClientConfig {

    /**
     * Returns the maximal size of the in flight window (MQTT)
     *
     * @return maximal size of the in flight window
     * @see org.eclipse.paho.client.mqttv3.MqttConnectOptions#setMaxInflight(int)
     */
    int getMaxInFlight();

    /**
     * Returns the keep alive interval in seconds
     *
     * @return the keep alive interval in seconds
     * @see org.eclipse.paho.client.mqttv3.MqttConnectOptions#setKeepAliveInterval(int)
     */
    int getKeepAliveInterval();

}
