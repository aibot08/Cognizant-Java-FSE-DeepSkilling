package com.stock.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.entity.Stock;
import com.stock.repository.StockRepository;

@Service
public class StockService {

    @Autowired
    private StockRepository repository;

    public List<Stock> getFacebookStocks() {
        return repository.findByCodeAndDateBetween(
                "FB",
                LocalDate.of(2019, 9, 1),
                LocalDate.of(2019, 9, 30));
    }
}
