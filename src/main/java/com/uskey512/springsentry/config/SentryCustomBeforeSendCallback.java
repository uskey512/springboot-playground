package com.uskey512.springsentry.config;

import org.springframework.stereotype.Component;

import com.uskey512.springsentry.exception.SentryFilteredException;

import io.sentry.SentryEvent;
import io.sentry.SentryOptions;

@Component
public class SentryCustomBeforeSendCallback implements SentryOptions.BeforeSendCallback {
    @Override
    public SentryEvent execute(SentryEvent event, Object hint) {
        if (event.getThrowable() instanceof SentryFilteredException) {
            return null;
        }
        return event;
    }
}
