package com.foo.components.config;

import com.foo.components.Metrics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricsConfig {

    @Bean
    public Metrics getMetrics() {
        return new Metrics();
    }

}
