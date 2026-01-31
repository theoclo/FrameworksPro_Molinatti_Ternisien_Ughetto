package com.tp.partie2;

public class NotificationService {
    private MessageSender sender;

    // Injection par constructeur : on ne fait plus "new" ici !
    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String msg) {
        sender.send(msg);
    }
}