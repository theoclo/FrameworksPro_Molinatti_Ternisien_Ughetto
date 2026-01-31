package com.tp.partie2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextPartie2.xml");

        NotificationService service = context.getBean(NotificationService.class);

        service.notifyUser("Bonjour Spring XML");
    }
}