package com.cognizant.orm_learn;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {

    Country findByCode(String code);

    void deleteByCode(String code);

    List<Country> findAllByOrderByNameAsc();
}