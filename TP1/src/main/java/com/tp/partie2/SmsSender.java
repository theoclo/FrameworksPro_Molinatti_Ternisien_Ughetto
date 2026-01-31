package com.tp.partie2;

public class SmsSender implements MessageSender {
    public void send(String message) {
        System.out.println("SMS : " + message);
    }
}