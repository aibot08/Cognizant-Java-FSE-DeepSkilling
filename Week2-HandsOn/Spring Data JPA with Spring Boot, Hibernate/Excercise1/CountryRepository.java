package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}
