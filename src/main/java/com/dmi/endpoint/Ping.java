package com.dmi.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class Ping implements Supplier<String>  {
    private static final Logger LOGGER = LoggerFactory.getLogger(Ping.class);
    @Override
    public String get() {
        LOGGER.info("Ping");
        return "pong";
    }
}
