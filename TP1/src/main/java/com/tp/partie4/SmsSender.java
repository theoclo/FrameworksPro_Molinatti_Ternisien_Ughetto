package com.tp.partie4;

import org.springframework.stereotype.Service;

@Service
public class SmsSender implements MessageSender {
    public void send(String message) {
        System.out.println("SMS : " + message);
    }
}
