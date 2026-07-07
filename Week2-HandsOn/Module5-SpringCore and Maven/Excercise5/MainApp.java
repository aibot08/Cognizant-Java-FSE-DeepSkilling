package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.library.config.AppConfig;
import com.library.model.Book;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Book b1 = context.getBean(Book.class);
        Book b2 = context.getBean(Book.class);

        System.out.println(b1 == b2);
    }
}
