package com.tp.partie5;

import org.springframework.stereotype.Service;

@Service
public class EmailSender implements MessageSender {
    public void send(String message) {
        System.out.println("Email : " + message);
    }
}