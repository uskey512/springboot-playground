package com.uskey512.springsentry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uskey512.springsentry.exception.SentryFilteredException;
import com.uskey512.springsentry.exception.SentryNonFilteredException;

@RestController
@RequestMapping("/test")
public class ExceptionTestController {

    @GetMapping("/filtered-exception")
    public void generateFilteredException() {
        throw new SentryFilteredException();
    }

    @GetMapping("/non-filtered-exception")
    public void generateNonFilteredException() {
        throw new SentryNonFilteredException();
    }

}
