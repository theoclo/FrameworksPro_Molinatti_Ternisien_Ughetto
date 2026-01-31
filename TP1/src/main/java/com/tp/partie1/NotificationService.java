package com.tp.partie1;
public class NotificationService {

    private EmailSender sender = new EmailSender();

    public void notifyUser(String msg) {
        sender.send(msg);
    }
}