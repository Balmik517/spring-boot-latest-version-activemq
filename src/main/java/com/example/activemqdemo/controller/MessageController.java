package com.example.activemqdemo.controller;

import com.example.activemqdemo.config.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publish")
public class MessageController {

    @Autowired
    private MessageProducer messageProducer;

    @GetMapping("/send")
    public String sendMessage() {
        String message = "Hello from ActiveMQ!";
        messageProducer.sendMessage(message);
        return "Message sent to ActiveMQ: " + message;
    }
}
