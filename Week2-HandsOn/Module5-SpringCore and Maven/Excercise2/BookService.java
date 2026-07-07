package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;


    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook() {
        repository.saveBook();
    }
}
