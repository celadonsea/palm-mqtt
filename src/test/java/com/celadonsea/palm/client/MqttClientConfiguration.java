package com.celadonsea.palm.client;

import com.celadonsea.palm.config.MqttClientConfig;
import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class MqttClientConfiguration implements MqttClientConfig {

    private String clientDialect = "com.celadonsea.palm.client.TestMessageClient";

    private String clientId = "mqtttestclient";

    private String brokerUrl = "tcp://localhost:1883";

    private int maxInFlight = 100;

    private int connectionTimeout = 1000;

    private int keepAliveInterval = 1000;

    private int qos = 2;

    private boolean connectionSecured = false;

    private int maxThread = 10;

    private int threadKeepAliveTime = 1;

    @Bean
    public MessageClient mqttMessageClient() {
        return new MqttMessageClient(this);
    }
}
