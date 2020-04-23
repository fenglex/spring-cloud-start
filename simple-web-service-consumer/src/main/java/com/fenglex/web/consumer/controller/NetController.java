package com.fenglex.web.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/net-consumer")
public class NetController {

    private final RestTemplate restTemplate;

    public NetController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/ip")
    public String getIp() {
        return restTemplate.getForObject("http://localhost:8000/net/ip", String.class);
    }
}
