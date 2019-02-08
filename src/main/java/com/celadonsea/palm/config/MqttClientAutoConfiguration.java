package com.celadonsea.palm.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Auto configuration which is configured in the META-INF/spring.factories.
 * It will be auto scanned by spring.
 *
 * It creates the necessary beans for auto scanning message controllers.
 *
 * @author Rafael Revesz
 * @since 1.0
 */
@Slf4j
@Configuration
public class MqttClientAutoConfiguration {

    @Bean
    public ObjectMapper placeHolder() {
        return new ObjectMapper();
    }

}
