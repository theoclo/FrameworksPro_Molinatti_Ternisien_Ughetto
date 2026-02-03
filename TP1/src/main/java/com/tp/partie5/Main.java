package com.tp.partie5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextPartie5.xml");
        NotificationService service =
                context.getBean(NotificationService.class);
        service.notifyUser("Injection réussie");
    }
}
