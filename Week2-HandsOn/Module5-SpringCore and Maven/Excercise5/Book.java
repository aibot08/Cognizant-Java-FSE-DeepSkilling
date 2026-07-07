package com.library.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Book {

    public Book() {
        System.out.println("Book Bean Created");
    }
}
