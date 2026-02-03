package com.tp.partie3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextPartie3.xml");
        NotificationService service =
                context.getBean(NotificationService.class);
        service.notifyUser("Injection réussie");
    }
}