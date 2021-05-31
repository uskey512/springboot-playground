package com.uskey512.springsentry.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uskey512.springsentry.exception.SentryFilteredException;
import com.uskey512.springsentry.exception.SentryNonFilteredException;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public void index() {
        Random random = new Random();
        int i = random.nextInt(90);

        if (60 <= i) {
            throw new SentryFilteredException();
        } else if (30 <= i) {
            throw new SentryNonFilteredException();
        }
    }
}
