package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Country;
import com.library.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public List<Country> getAllCountries() {
        return repository.findAll();
    }
}
