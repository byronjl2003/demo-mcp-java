package com.example.demomcpjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MspController {

    @GetMapping("/msp")
    public String mspEndpoint() {
        return "MSP Server is running!";
    }
}
