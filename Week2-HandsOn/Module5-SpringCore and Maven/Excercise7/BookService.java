package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {

    private BookRepository repository;

    @Autowired
    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook() {
        repository.saveBook();
        System.out.println("Constructor and Setter Injection Successful");
    }
}
