package com.uskey512.springsentry.config;

import org.springframework.stereotype.Component;

import com.uskey512.springsentry.exception.SentryFilteredException;

import io.sentry.EventProcessor;
import io.sentry.SentryEvent;

@Component
public class SentryExceptionFilterProcessor implements EventProcessor {

    @Override
    public SentryEvent process(SentryEvent event, Object hint) {
        if (event.getThrowable() instanceof SentryFilteredException) {
            return null;
        }
        return event;
    }
    
}
