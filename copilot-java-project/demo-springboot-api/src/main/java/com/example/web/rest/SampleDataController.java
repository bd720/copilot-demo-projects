package com.example.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// create api against route '/api/v1/demo-springboot-api/sampledata'
@RestController("/api/v1/demo-springboot-api/sampledata")
public class SampleDataController {
    // allow GET requests against route '/api/v1/demo-springboot-api/sampledata'
    // return a string
    @GetMapping//manual annotated
    public String getSampleData() {
        return "Hello World!";
    }
}

