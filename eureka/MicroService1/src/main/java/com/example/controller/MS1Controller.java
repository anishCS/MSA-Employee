package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MS1Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ms1")
    public String meth() {
        String microservice2Response = restTemplate.getForObject("http://localhost:8082/ms2", String.class);
        return "Instructions Page: " + microservice2Response + "<br>" ;
    }
}