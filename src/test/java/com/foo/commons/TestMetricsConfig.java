package com.foo.commons;

import com.foo.components.Metrics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestMetricsConfig {

    @Bean
    public Metrics getMetrics() {
        return new Metrics(1);
    }

}
