package com.foo.components;

import org.springframework.stereotype.Component;

@Component
public class Metrics {

    private int interval;

    public Metrics() {
    }

    public Metrics(int interval) {
        this.interval = interval;
    }

    public int getInterval() {
        return interval;
    }

}
