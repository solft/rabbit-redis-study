package com.example.rabbithome.controller;

import com.example.rabbithome.service.RabbitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {

    private RabbitService rabbitService;

    public RabbitController(RabbitService rabbitService){
        this.rabbitService = rabbitService;
    }

    @GetMapping("/rabbit/{message}")
    public String sendRabbit(@PathVariable("message") String message) {
        rabbitService.sendMessage(message);
        return "OK";
    }
}
